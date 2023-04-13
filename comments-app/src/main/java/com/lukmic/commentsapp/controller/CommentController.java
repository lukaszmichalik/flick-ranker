package com.lukmic.commentsapp.controller;

import com.lukmic.commentsapp.dto.request.CommentRequest;
import com.lukmic.commentsapp.dto.response.CommentResponse;
import com.lukmic.commentsapp.service.CommentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/api/v1/comments")
public class CommentController {

    final private CommentService commentService;

    @PostMapping
    ResponseEntity<Long> createPlacement(@Valid @RequestBody CommentRequest commentRequest) {

        return commentService.createComment(commentRequest);
    }

    @GetMapping("/ranking-comments/{rankingId}")
    ResponseEntity<List<CommentResponse>> getPlacementsByRankingId(@PathVariable Long rankingId) {

        return commentService.getCommentsByRankingId(rankingId);
    }
}
