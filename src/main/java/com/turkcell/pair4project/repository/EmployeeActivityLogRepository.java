package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.EmployeeActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeActivityLogRepository extends JpaRepository<EmployeeActivityLog, Integer> {
}
