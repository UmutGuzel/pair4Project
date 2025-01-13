package com.turkcell.pair4project.repository;


import com.turkcell.pair4project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
