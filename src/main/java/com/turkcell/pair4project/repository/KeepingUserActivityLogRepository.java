package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.KeepingUserActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeepingUserActivityLogRepository extends JpaRepository<KeepingUserActivityLog, Integer> {
}
