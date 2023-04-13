package com.lukmic.commentsapp.model;

import com.lukmic.commentsapp.dto.request.CommentRequest;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Entity
@Table(schema = "comments_db",	name = "comments")
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private Long authorId;
    private Long rankingId;
    private Date date;

    public Comment(CommentRequest commentRequest) {
        this.content = commentRequest.getContent();
        this.authorId = commentRequest.getAuthorId();
        this.rankingId = commentRequest.getRankingId();
        this.date = commentRequest.getDate();
    }
}
