package com.aravind.rajnikanth.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.stream.Collectors;

@Service
@Slf4j
public class MovieService {

    private static String movies_url = "https://api.themoviedb.org/3/person/91555/movie_credits?api_key=0e85922634ca24a813aa9390116829ed";
    private static String val;
    private static JSONObject jsonObject;
    ObjectMapper mapper = new ObjectMapper();
    Cast[] movieData;

    @Autowired
    private MoviesRepository repository;

    MoviesModel moviesModel = new MoviesModel();

    @SneakyThrows
    @EventListener(ApplicationReadyEvent.class)
    @PostConstruct
    public void getData(){
        log.info("Inside getData method");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(movies_url)).build();
        HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString());
        StringReader stringReader = new StringReader(send.body());
        val = IOUtils.toString(stringReader);
        jsonObject = new JSONObject(val);
        this.movieData = mapper.readValue(jsonObject.get("cast").toString(), Cast[].class);
        saveOrUpdate(this.movieData);
    }

    public void saveOrUpdate(Cast[] casts){
        Arrays.stream(casts).map(
                (cast -> {
                    moviesModel.setId(cast.getId());
                    moviesModel.setTitle(cast.getTitle());
                    moviesModel.setRelease_date(cast.getRelease_date());
                    moviesModel.setOriginal_language(cast.getOriginal_language());
                    moviesModel.setOriginal_title(cast.getOriginal_title());
                    moviesModel.setOverview(cast.getOverview());
                    moviesModel.setPoster_path(cast.getPoster_path());
                    moviesModel.setPopularity(cast.getPopularity());
                    moviesModel.setCharacter(cast.getCharacter());
                    moviesModel.setBackdrop_path(cast.getBackdrop_path());
                    repository.save(this.moviesModel);
                    return moviesModel;
                })
        ).collect(Collectors.toList());
    }

    public MoviesModel getMoviesById(int id) {
        return repository.findById(id);
    }
}
