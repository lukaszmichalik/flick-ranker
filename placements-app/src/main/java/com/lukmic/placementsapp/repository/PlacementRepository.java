package com.lukmic.placementsapp.repository;

import com.lukmic.placementsapp.model.Placement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Long> {
}
