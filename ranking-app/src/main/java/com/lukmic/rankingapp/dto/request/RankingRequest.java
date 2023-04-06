package com.lukmic.rankingapp.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RankingRequest {

    @NotNull
    @Size(min = 3, max = 40)
    private String title;
    private Integer noOfPlacements;
    private Integer noOfLikes;
    @Size(max = 300)
    private String description;
    @NotNull
    private Long authorId;

}
