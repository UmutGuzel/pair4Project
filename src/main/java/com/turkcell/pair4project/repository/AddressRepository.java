package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
