package com.app.parking_spots.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface IParkingSpotRepository extends JpaRepository<ParkingSpot, Long> {

    // Get all ParkingSpotss (already provided by JpaRepository)
    @Override
    @NonNull
    List<ParkingSpot> findAll();

    // Search ParkingSpots by ID (already provided by JpaRepository)
    @Override
    @NonNull
    Optional<ParkingSpot> findById(@NonNull Long id);
    
    // Save a ParkingSpots (already provided by JpaRepository)
    @Override
    @NonNull
    <S extends ParkingSpot> S save(@NonNull S parkingSpots);

    // Check if a ParkingSpots with a specific ID exists (already provided by JpaRepository)
    @Override
    boolean existsById(@NonNull Long id);

    // Delete ParkingSpots by ID (already provided by JpaRepository)
    @Override
    void deleteById(@NonNull Long id);
}