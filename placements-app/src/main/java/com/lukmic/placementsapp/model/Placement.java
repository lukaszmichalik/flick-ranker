package com.lukmic.placementsapp.model;

import com.lukmic.placementsapp.dto.request.PlacementRequest;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "placements_db",	name = "placements")
public class Placement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer standing;
    private Long rankingId;
    private Long movieId;
    private String description;

    public Placement(PlacementRequest placementRequest) {
        this.standing = placementRequest.getStanding();
        this.rankingId = placementRequest.getRankingId();
        this.movieId = placementRequest.getMovieId();
        this.description = placementRequest.getDescription();
    }
}
