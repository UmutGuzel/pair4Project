package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
