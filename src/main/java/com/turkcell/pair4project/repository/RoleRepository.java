package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.EmployeeRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<EmployeeRole, Integer> {
}
