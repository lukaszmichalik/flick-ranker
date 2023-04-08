package com.lukmic.rankingapp.controller;

import com.lukmic.rankingapp.dto.request.RankingRequest;
import com.lukmic.rankingapp.dto.response.RankingResponse;
import com.lukmic.rankingapp.service.RankingService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/rankings")
@AllArgsConstructor
public class RankingController {

    final private RankingService rankingService;

    @PostMapping
    public ResponseEntity<Long> createRanking(@Valid @RequestBody RankingRequest rankingRequest) {

        return rankingService.createRanking(rankingRequest);
    }

    @GetMapping("/{rankingId}")
    public ResponseEntity<RankingResponse> getRanking (@PathVariable Long rankingId) {
        return rankingService.getRanking(rankingId);
    }
}
