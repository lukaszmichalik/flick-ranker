package com.lukmic.placementsapp.service;

import com.lukmic.placementsapp.dto.request.PlacementRequest;
import com.lukmic.placementsapp.dto.response.PlacementResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PlacementService {

    ResponseEntity<Long> createPlacement(PlacementRequest placementRequest);
    ResponseEntity<List<PlacementResponse>> getPlacementsByRankingId(Long rankingId);
}
