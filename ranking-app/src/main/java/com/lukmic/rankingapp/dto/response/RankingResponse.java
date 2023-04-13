package com.lukmic.rankingapp.dto.response;

import com.lukmic.rankingapp.model.Ranking;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RankingResponse {
    private String title;
    private Integer noOfPlacements;
    private Integer noOfLikes;
    private String description;
    private Long authorId;
    private PlacementResponse[] placements;
    private CommentResponse[] comments;

    public RankingResponse(Ranking ranking) {
        this.title = ranking.getTitle();
        this.noOfPlacements = ranking.getNoOfPlacements();
        this.noOfLikes = ranking.getNoOfLikes();
        this.description = ranking.getDescription();
        this.authorId = ranking.getAuthorId();
    }
}
