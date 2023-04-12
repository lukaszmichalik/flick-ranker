package com.lukmic.rankingapp.dto.response;

import com.lukmic.rankingapp.model.Movie;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlacementResponse {
    private Integer standing;
    private Long rankingId;
    private Long movieId;

    private Movie movie;
    private String description;
    private String mediaType;
}
