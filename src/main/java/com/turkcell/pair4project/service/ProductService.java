package com.turkcell.pair4project.service;

import com.turkcell.pair4project.entity.Product;

import java.util.List;

public interface ProductService
{
  Product add(Product product);
  List<Product> getAll();
  Product getById(int id);
}
