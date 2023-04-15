package com.lukmic.rankingapp.client;

import com.lukmic.rankingapp.dto.response.CommentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "comments", url = "http://localhost:8083/api/v1/comments")
public interface CommentsClient {

    @GetMapping("/ranking-comments/{rankingId}")
    ResponseEntity<CommentResponse[]> getCommentsByRankingId(@PathVariable("rankingId") Long rankingId);
}
