package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.Situation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SituationRepository extends JpaRepository<Situation, Integer> {
}
