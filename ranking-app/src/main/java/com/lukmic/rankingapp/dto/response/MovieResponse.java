package com.lukmic.rankingapp.dto.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieResponse {

    @JsonAlias("name")
    private String title;
    private String poster_path;
    @JsonAlias("first_air_date")
    private String release_date;
}
