package com.turkcell.pair4project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer_segmentations")
public class CustomerSegmentation
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "customerSegmentation", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Customer> customers;

    @OneToMany(mappedBy = "customerSegmentation", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Promotion> promotions;

    @OneToMany(mappedBy = "customerSegmentation", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Campaign> campaigns;
}
