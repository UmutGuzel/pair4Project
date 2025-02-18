package com.turkcell.pair4project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name="name")
  private String name;
  @Column(name="unit_price")
  private BigDecimal price;
  @Column(name="stock")
  private Integer stock;

  @ManyToOne
  @JoinColumn(name = "promotion_id")
  private Promotion promotion;
  @ManyToOne
  @JoinColumn(name = "product_type_id")
  private ProductType productType;
  @ManyToOne
  @JoinColumn(name = "campaign_id")
  private Campaign campaign;
}
