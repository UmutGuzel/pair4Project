package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.FeedbackType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackTypeRepository extends JpaRepository<FeedbackType, Integer> {
}
