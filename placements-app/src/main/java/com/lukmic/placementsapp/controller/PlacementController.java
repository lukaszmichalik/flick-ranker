package com.lukmic.placementsapp.controller;

import com.lukmic.placementsapp.dto.request.PlacementRequest;
import com.lukmic.placementsapp.dto.response.PlacementResponse;
import com.lukmic.placementsapp.service.PlacementService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/api/v1/placements")
public class PlacementController {

    final private PlacementService placementService;

    @PostMapping
    ResponseEntity<Long> createPlacement(@Valid @RequestBody PlacementRequest placementRequest) {

        return placementService.createPlacement(placementRequest);
    }

    @GetMapping("/ranking-placements/{rankingId}")
    ResponseEntity<List<PlacementResponse>> getPlacementsByRankingId(@PathVariable Long rankingId) {

        return placementService.getPlacementsByRankingId(rankingId);
    }
}
