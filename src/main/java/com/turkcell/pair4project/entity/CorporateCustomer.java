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
@Table(name = "corporate_customer")
public class CorporateCustomer {
    @Id
    @Column(name ="id")
    private Integer id;
    @Column(name="text_no")
    private String taxNo;
    @Column(name="corporate_name")
    private String corporateName;
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "id")
    private Customer customer;
}
