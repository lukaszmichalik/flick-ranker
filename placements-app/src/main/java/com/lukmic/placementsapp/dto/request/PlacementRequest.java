package com.lukmic.placementsapp.dto.request;

import com.lukmic.placementsapp.types.EMediaType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlacementRequest {
    private Integer standing;
    private Long rankingId;
    private Long movieId;
    private String description;
    @Enumerated(EnumType.STRING)
    private EMediaType mediaType;
}
