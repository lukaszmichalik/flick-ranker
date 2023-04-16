package com.lukmic.commentsapp.service;

import com.lukmic.commentsapp.client.UserClient;
import com.lukmic.commentsapp.dto.request.CommentRequest;
import com.lukmic.commentsapp.dto.response.CommentResponse;
import com.lukmic.commentsapp.repository.CommentRepository;
import com.lukmic.commentsapp.model.Comment;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService {

    final private CommentRepository commentRepository;
    final private UserClient userClient;

    @Override
    public ResponseEntity<Long> createComment(CommentRequest commentRequest) {

        Comment placement = new Comment(commentRequest);
        commentRepository.save(placement);

        return ResponseEntity.status(HttpStatus.CREATED).body(placement.getId());
    }

    @Override
    public ResponseEntity<List<CommentResponse>> getCommentsByRankingId(Long rankingId) {

        List<Comment> comments = commentRepository.findAllByRankingId(rankingId).stream().toList();
        List<CommentResponse> commentsResponse = new ArrayList<>();

        comments.forEach(comment -> {
            CommentResponse commentResponse = new CommentResponse(comment);
            commentResponse.setAuthor(userClient.getUser(comment.getAuthorId()).getBody());

            commentsResponse.add(commentResponse);
        });

        return ResponseEntity.ok(commentsResponse);
    }
}
