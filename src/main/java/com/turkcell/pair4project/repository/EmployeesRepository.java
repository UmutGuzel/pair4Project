package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employee, Integer> {
}
