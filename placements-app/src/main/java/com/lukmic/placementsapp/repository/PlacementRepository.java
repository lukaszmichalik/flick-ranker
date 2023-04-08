package com.lukmic.placementsapp.repository;

import com.lukmic.placementsapp.model.Placement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Long> {
    Set<Placement> findAllByRankingId(Long rankingId);
}
