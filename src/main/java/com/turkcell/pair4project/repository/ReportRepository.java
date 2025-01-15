package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Integer> {
}
