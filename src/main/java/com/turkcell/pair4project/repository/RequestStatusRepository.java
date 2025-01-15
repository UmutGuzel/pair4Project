package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestStatusRepository extends JpaRepository<RequestStatus, Integer> {
}
