package com.lukmic.rankingapp.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlacementResponse {
    private Integer standing;
    private Long rankingId;
    private Long movieId;
    private MovieResponse movie;
    private String description;
    private String mediaType;
}
