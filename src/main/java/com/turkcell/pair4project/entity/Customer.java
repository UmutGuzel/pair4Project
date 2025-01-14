package com.turkcell.pair4project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;
    @Column(name="telephone_number")
    private String telephoneNumber;
    @Column(name="email")
    private String email;

    @OneToOne(mappedBy = "customer")
    private IndividualCustomer individualCustomer;
    @OneToOne(mappedBy = "customer")
    private CorporateCustomer corporateCustomer;
}
