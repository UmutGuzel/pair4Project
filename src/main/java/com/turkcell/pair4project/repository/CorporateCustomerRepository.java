package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.CorporateCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateCustomerRepository extends JpaRepository<CorporateCustomer,Integer> {
}
