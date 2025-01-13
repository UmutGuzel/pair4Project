package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
}
