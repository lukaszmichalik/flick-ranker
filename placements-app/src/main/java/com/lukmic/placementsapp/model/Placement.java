package com.lukmic.placementsapp.model;

import com.lukmic.placementsapp.dto.request.PlacementRequest;
import com.lukmic.placementsapp.types.EMediaType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(schema = "placements_db",	name = "placements")
@NoArgsConstructor
public class Placement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer standing;
    private Long rankingId;
    private Long movieId;
    private String description;
    @Enumerated(EnumType.STRING)
    private EMediaType mediaType;

    public Placement(PlacementRequest placementRequest) {
        this.standing = placementRequest.getStanding();
        this.rankingId = placementRequest.getRankingId();
        this.movieId = placementRequest.getMovieId();
        this.description = placementRequest.getDescription();
        this.mediaType = placementRequest.getMediaType();
    }
}
