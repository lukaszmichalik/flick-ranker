package com.lukmic.rankingapp.service;

import com.lukmic.rankingapp.client.CommentsClient;
import com.lukmic.rankingapp.client.PlacementClient;
import com.lukmic.rankingapp.client.TheMovieDBClient;
import com.lukmic.rankingapp.configuration.TheMovieDBConfigProperties;
import com.lukmic.rankingapp.dto.request.RankingRequest;
import com.lukmic.rankingapp.dto.response.CommentResponse;
import com.lukmic.rankingapp.dto.response.RankingResponse;
import com.lukmic.rankingapp.exception.NotFoundException;
import com.lukmic.rankingapp.dto.response.PlacementResponse;
import com.lukmic.rankingapp.model.Ranking;
import com.lukmic.rankingapp.repository.RankingRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@AllArgsConstructor
public class RankingServiceImpl implements RankingService {

    private final RankingRepository rankingRepository;
    private final TheMovieDBConfigProperties tmdbConfig;
    private final CommentsClient commentsClient;
    private final TheMovieDBClient tmdbClient;
    private final PlacementClient placementClient;

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

        RankingResponse rankingResponse = new RankingResponse(ranking);

//        calling placements-app using Feign Client
        PlacementResponse[] placements = placementClient.getPlacementsByRankingId(rankingId).getBody();
        rankingResponse.setPlacements(placements);

//        calling themoviedb.org using Feign Client
        if (placements != null) {
            Arrays.stream(placements).forEach(placement ->
                    placement.setMovie(tmdbClient.getMovie(placement.getMovieId(),
                            placement.getMediaType(), tmdbConfig.apiKey()).getBody()));
        }

//        calling comments-app using Feign Client
        ResponseEntity<CommentResponse[]> responseEntity = commentsClient.getCommentsByRankingId(rankingId);
        CommentResponse[] comments = responseEntity.getBody();
        rankingResponse.setComments(comments);

        return ResponseEntity.ok(rankingResponse);
    }
}
