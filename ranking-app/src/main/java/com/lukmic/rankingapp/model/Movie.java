package com.lukmic.rankingapp.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {

    @JsonAlias("name")
    private String title;
    private String poster_path;
    @JsonAlias("first_air_date")
    private String release_date;
}
