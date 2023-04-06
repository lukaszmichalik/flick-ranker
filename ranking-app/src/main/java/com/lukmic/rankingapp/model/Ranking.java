package com.lukmic.rankingapp.model;

import com.lukmic.rankingapp.dto.request.RankingRequest;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(schema = "rankings_db",	name = "rankings")
public class Ranking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer noOfPlacements;
    private Integer noOfLikes;
    private String description;
    private Long authorId;

    public Ranking(RankingRequest rankingRequest) {
        this.title = rankingRequest.getTitle();
        this.noOfPlacements = rankingRequest.getNoOfPlacements();
        this.noOfLikes = rankingRequest.getNoOfLikes();
        this.description = rankingRequest.getDescription();
        this.authorId = rankingRequest.getAuthorId();
    }
}
