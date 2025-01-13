package com.turkcell.pair4project.controller;


import com.turkcell.pair4project.entity.Product;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import com.turkcell.pair4project.repository.ProductRepository;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/products")
public class ProductsController
{
  private final ProductRepository productRepository;

  // DI -> Dependency Injection Pattern
  public ProductsController(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @GetMapping()
  public List<Product> getAll() {
    return productRepository.findAll();
  }

  @GetMapping("{id}")
  public Product getById(@PathVariable int id) {
      return productRepository.getReferenceById(id);
  }

  @PostMapping()
  public Product add(@RequestBody @Valid Product product) {
    return productRepository.save(product);
  }

  @DeleteMapping("{id}")
  public String delete(@PathVariable int id) {
    return "Silindi ?? Bulunamadı";
  }

  @PutMapping()
  public Product update(@RequestBody Product product) {
      return product; // Güncelledikten sonra.
  }
}
