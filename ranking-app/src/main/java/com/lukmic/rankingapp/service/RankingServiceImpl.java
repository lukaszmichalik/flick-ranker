package com.lukmic.rankingapp.service;

import com.lukmic.rankingapp.dto.request.RankingRequest;
import com.lukmic.rankingapp.dto.response.RankingResponse;
import com.lukmic.rankingapp.exception.NotFoundException;
import com.lukmic.rankingapp.model.Ranking;
import com.lukmic.rankingapp.repository.RankingRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RankingServiceImpl implements RankingService {

    final private RankingRepository rankingRepository;

    @Override
    public ResponseEntity<Long> createRanking(RankingRequest rankingRequest) {

        Ranking ranking = new Ranking(rankingRequest);
        rankingRepository.save(ranking);

        return ResponseEntity.status(HttpStatus.CREATED).body(ranking.getId());
    }

    @Override
    public ResponseEntity<RankingResponse> getRanking(Long rankingId) {

        Ranking ranking = rankingRepository.findById(rankingId)
                .orElseThrow(()-> new NotFoundException("Not found"));

        return ResponseEntity.ok(new RankingResponse(ranking));
    }
}
