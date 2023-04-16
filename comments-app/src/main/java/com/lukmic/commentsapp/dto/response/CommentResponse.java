package com.lukmic.commentsapp.dto.response;

import com.lukmic.commentsapp.model.Comment;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class CommentResponse {
    private String content;
    private AuthorResponse author;
    private Long rankingId;
    private Date date;
    public CommentResponse(Comment comment) {
        this.content = comment.getContent();
        this.rankingId = comment.getRankingId();
        this.date = comment.getDate();
    }
}
