package com.lukmic.rankingapp.client;

import com.lukmic.rankingapp.dto.response.PlacementResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "placements", url = "http://localhost:8082/api/v1/placements")
public interface PlacementClient {

    @GetMapping("/ranking-placements/{rankingId}")
    ResponseEntity<PlacementResponse[]> getPlacementsByRankingId(@PathVariable("rankingId") Long rankingId);
}