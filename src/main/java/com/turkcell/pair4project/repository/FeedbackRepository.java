package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
}
