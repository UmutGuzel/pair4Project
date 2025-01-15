package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.FeedbackStatusTracking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackStatusTrackingRepository extends JpaRepository<FeedbackStatusTracking, Integer> {
}
