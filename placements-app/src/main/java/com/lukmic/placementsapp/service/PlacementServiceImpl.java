package com.lukmic.placementsapp.service;

import com.lukmic.placementsapp.dto.request.PlacementRequest;
import com.lukmic.placementsapp.dto.response.PlacementResponse;
import com.lukmic.placementsapp.repository.PlacementRepository;
import lombok.AllArgsConstructor;
import com.lukmic.placementsapp.model.Placement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlacementServiceImpl implements PlacementService {

    final private PlacementRepository placementRepository;

    @Override
    public ResponseEntity<Long> createPlacement(PlacementRequest placementRequest) {

        Placement placement = new Placement(placementRequest);
        placementRepository.save(placement);

        return ResponseEntity.status(HttpStatus.CREATED).body(placement.getId());
    }

    @Override
    public ResponseEntity<List<PlacementResponse>> getPlacementsByRankingId(Long rankingId) {

        List<PlacementResponse> placements = placementRepository.findAllByRankingId(rankingId).stream()
                .map(PlacementResponse::new).toList();

        System.out.println(placements);

        return ResponseEntity.ok(placements);
    }
}
