package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
