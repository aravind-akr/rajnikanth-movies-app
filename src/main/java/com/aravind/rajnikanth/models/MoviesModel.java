package com.aravind.rajnikanth.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class MoviesModel {

    @Id
    private int id;
    private String title;
    private Date release_date;
    private String original_language;
    private String original_title;
    @Column(length = 1000)
    private String overview;
    private String poster_path;
    private double popularity;
    private String character;
    private String backdrop_path;

}
