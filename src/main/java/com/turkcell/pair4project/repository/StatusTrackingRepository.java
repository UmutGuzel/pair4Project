package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.StatusTracking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusTrackingRepository extends JpaRepository<StatusTracking, Integer> {
}
