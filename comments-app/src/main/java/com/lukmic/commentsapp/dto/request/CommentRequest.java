package com.lukmic.commentsapp.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class CommentRequest {
    private String content;
    private Long authorId;
    private Long rankingId;
    private Date date;
}
