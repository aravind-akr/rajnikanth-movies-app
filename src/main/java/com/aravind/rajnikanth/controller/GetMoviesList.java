package com.aravind.rajnikanth.controller;

import com.aravind.rajnikanth.models.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class GetMoviesList {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies/{id}")
    public ResponseEntity<?> getMoviesById(@PathVariable("id") int id){
        return new ResponseEntity<>(movieService.getMoviesById(id), HttpStatus.OK);
    }

}
