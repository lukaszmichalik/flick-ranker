package com.lukmic.commentsapp.dto.response;

import com.lukmic.commentsapp.model.Comment;
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
    public CommentResponse(Comment comment) {
        this.content = comment.getContent();
        this.authorId = comment.getAuthorId();
        this.rankingId = comment.getRankingId();
        this.date = comment.getDate();
    }
}
