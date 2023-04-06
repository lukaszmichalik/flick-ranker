package com.lukmic.placementsapp.controller;

import com.lukmic.placementsapp.dto.request.PlacementRequest;
import com.lukmic.placementsapp.service.PlacementService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/api/v1/placements")
public class PlacementController {

    final private PlacementService placementService;

    @PostMapping
    ResponseEntity<Long> createPlacement(@Valid @RequestBody PlacementRequest placementRequest) {

        return placementService.createPlacement(placementRequest);
    }
}
