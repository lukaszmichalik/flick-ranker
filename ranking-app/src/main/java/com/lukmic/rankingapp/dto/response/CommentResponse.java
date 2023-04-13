package com.lukmic.rankingapp.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class CommentResponse {
    private String content;
    private Long authorId;
    private Long rankingId;
    private Date date;
}
