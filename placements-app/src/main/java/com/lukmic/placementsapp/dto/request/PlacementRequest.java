package com.lukmic.placementsapp.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlacementRequest {
    private Integer standing;
    private Long rankingId;
    private Long movieId;
    private String description;
}
