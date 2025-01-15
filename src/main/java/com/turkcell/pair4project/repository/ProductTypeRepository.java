package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {
}
