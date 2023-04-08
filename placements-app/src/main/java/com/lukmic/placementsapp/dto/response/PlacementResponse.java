package com.lukmic.placementsapp.dto.response;

import com.lukmic.placementsapp.model.Placement;
import com.lukmic.placementsapp.types.EMediaType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlacementResponse {

    private Integer standing;
    private Long rankingId;
    private Long movieId;
    private String description;
    @Enumerated(EnumType.STRING)
    private EMediaType mediaType;

    public PlacementResponse(Placement placement) {
        this.standing = placement.getStanding();
        this.rankingId = placement.getRankingId();
        this.movieId = placement.getMovieId();
        this.description = placement.getDescription();
        this.mediaType = placement.getMediaType();
    }
}
