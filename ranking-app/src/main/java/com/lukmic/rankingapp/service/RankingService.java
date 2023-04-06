package com.lukmic.rankingapp.service;

import com.lukmic.rankingapp.dto.request.IdRequest;
import com.lukmic.rankingapp.dto.request.RankingRequest;
import com.lukmic.rankingapp.dto.response.RankingResponse;
import org.springframework.http.ResponseEntity;

public interface RankingService {

    ResponseEntity<Long> createRanking(RankingRequest rankingRequest);
    ResponseEntity<RankingResponse> getRanking(IdRequest idRequest);
}
