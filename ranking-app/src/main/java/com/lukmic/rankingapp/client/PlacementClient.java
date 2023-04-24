package com.lukmic.rankingapp.client;

import com.lukmic.rankingapp.dto.response.PlacementResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PLACEMENTS-APP", path = "/api/v1/placements")
public interface PlacementClient {

    @GetMapping("/ranking-placements/{rankingId}")
    ResponseEntity<PlacementResponse[]> getPlacementsByRankingId(@PathVariable("rankingId") Long rankingId);
}
