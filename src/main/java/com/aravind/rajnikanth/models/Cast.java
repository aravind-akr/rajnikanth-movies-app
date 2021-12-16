package com.aravind.rajnikanth.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
public class Cast {

    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private int id;
    @Getter(onMethod_ = {@JsonProperty("video")})
    @Setter(onMethod_ = {@JsonProperty("video")})
    private boolean video;
    @Getter(onMethod_ = {@JsonProperty("vote_count")})
    @Setter(onMethod_ = {@JsonProperty("vote_count")})
    private long vote_count;
    @Getter(onMethod_ = {@JsonProperty("vote_average")})
    @Setter(onMethod_ = {@JsonProperty("vote_average")})
    private double vote_average;
    @Getter(onMethod_ = {@JsonProperty("title")})
    @Setter(onMethod_ = {@JsonProperty("title")})
    private String title;
    @Getter(onMethod_ = {@JsonProperty("release_date")})
    @Setter(onMethod_ = {@JsonProperty("release_date")})
    private Date release_date;
    @Getter(onMethod_ = {@JsonProperty("original_language")})
    @Setter(onMethod_ = {@JsonProperty("original_language")})
    private String original_language;
    @Getter(onMethod_ = {@JsonProperty("original_title")})
    @Setter(onMethod_ = {@JsonProperty("original_title")})
    private String original_title;
    @Getter(onMethod_ = {@JsonProperty("genre_ids")})
    @Setter(onMethod_ = {@JsonProperty("genre_ids")})
    private long[] genre_ids;
    @Getter(onMethod_ = {@JsonProperty("backdrop_path")})
    @Setter(onMethod_ = {@JsonProperty("backdrop_path")})
    private String backdrop_path;
    @Getter(onMethod_ = {@JsonProperty("adult")})
    @Setter(onMethod_ = {@JsonProperty("adult")})
    private boolean adult;
    @Getter(onMethod_ = {@JsonProperty("overview")})
    @Setter(onMethod_ = {@JsonProperty("overview")})
    private String overview;
    @Getter(onMethod_ = {@JsonProperty("poster_path")})
    @Setter(onMethod_ = {@JsonProperty("poster_path")})
    private String poster_path;
    @Getter(onMethod_ = {@JsonProperty("popularity")})
    @Setter(onMethod_ = {@JsonProperty("popularity")})
    private double popularity;
    @Getter(onMethod_ = {@JsonProperty("character")})
    @Setter(onMethod_ = {@JsonProperty("character")})
    private String character;
    @Getter(onMethod_ = {@JsonProperty("credit_id")})
    @Setter(onMethod_ = {@JsonProperty("credit_id")})
    private String credit_id;
    @Getter(onMethod_ = {@JsonProperty("order")})
    @Setter(onMethod_ = {@JsonProperty("order")})
    private Long order;
    @Getter(onMethod_ = {@JsonProperty("department")})
    @Setter(onMethod_ = {@JsonProperty("department")})
    private String department;
    @Getter(onMethod_ = {@JsonProperty("job")})
    @Setter(onMethod_ = {@JsonProperty("job")})
    private String job;
}
