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
@Table(name = "corporate_customers")
public class CorporateCustomer
{
    @Id
    @Column(name ="id")
    private Integer id;

    @Column(name="tax_no")
    private int taxNo;

    @Column(name="name")
    private String Name;

    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "id")
    private Customer customer;
}
