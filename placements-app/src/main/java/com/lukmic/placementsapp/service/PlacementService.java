package com.lukmic.placementsapp.service;

import com.lukmic.placementsapp.dto.request.PlacementRequest;
import com.lukmic.placementsapp.model.Placement;
import org.springframework.http.ResponseEntity;

import java.util.Set;

public interface PlacementService {

    ResponseEntity<Long> createPlacement(PlacementRequest placementRequest);
    ResponseEntity<Set<Placement>> getPlacementsByRankingId(Long rankingId);
}
