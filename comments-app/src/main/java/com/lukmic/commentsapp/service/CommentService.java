package com.lukmic.commentsapp.service;

import com.lukmic.commentsapp.dto.request.CommentRequest;
import com.lukmic.commentsapp.dto.response.CommentResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CommentService {

    ResponseEntity<Long> createComment(CommentRequest placementRequest);
    ResponseEntity<List<CommentResponse>> getCommentsByRankingId(Long rankingId);
}
