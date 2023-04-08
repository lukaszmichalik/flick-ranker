package com.lukmic.rankingapp.service;

import com.lukmic.rankingapp.dto.request.RankingRequest;
import com.lukmic.rankingapp.dto.response.RankingResponse;
import com.lukmic.rankingapp.exception.NotFoundException;
import com.lukmic.rankingapp.dto.response.PlacementResponse;
import com.lukmic.rankingapp.model.Ranking;
import com.lukmic.rankingapp.repository.RankingRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class RankingServiceImpl implements RankingService {

    private final RankingRepository rankingRepository;
    private final RestTemplate restTemplate;

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

//        calling placements-app
        PlacementResponse[] placements = callGetPlacementsByRankingId(ranking.getId());

        RankingResponse rankingResponse = new RankingResponse(ranking);

        rankingResponse.setPlacements(placements);

        return ResponseEntity.ok(rankingResponse);
    }

    private PlacementResponse[] callGetPlacementsByRankingId(Long rankingId) {
        ResponseEntity<PlacementResponse[]> responseEntity =
                restTemplate.getForEntity("http://localhost:8082/api/v1/placements/ranking-placements/"+rankingId,
                        PlacementResponse[].class);

        return responseEntity.getBody();

    }
}
