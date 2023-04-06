package com.lukmic.placementsapp.service;

import com.lukmic.placementsapp.dto.request.PlacementRequest;
import org.springframework.http.ResponseEntity;

public interface PlacementService {

    ResponseEntity<Long> createPlacement(PlacementRequest placementRequest);
}
