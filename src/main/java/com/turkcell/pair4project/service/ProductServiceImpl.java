package com.turkcell.pair4project.service;

import com.turkcell.pair4project.entity.Product;
import com.turkcell.pair4project.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//@Bean
//@Component
@Service
public class ProductServiceImpl implements ProductService
{
  // In-Memory Çalışma
  private List<Product> productList;

  public ProductServiceImpl() {
    productList = new ArrayList<Product>();
  }

  @Override
  public Product add(Product product) {
    // İŞ KURALLARI
    Product product1 = productList
            .stream()
            .filter(p -> p.getName().equals(product.getName())).findAny()
            .orElse(null);

    if(product1 != null) {
      throw new RuntimeException("Product already exists");
    }
    //


    // Identification
    Random random = new Random();
    product.setId(random.nextInt(1000));
    productList.add(product);


    return product;
  }

  @Override
  public List<Product> getAll() {
    return productList;
  }

  @Override
  public Product getById(int id) {
    // Java 19 - Stream API
    return productList
            .stream()
            .filter(product-> product.getId() == id)
            .findFirst()
            .orElse(null);
  }

}
