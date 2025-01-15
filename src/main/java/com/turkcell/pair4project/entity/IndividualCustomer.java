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
@Table(name = "individual_customers")
public class IndividualCustomer
{
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "identity_no")
    private int identityNo;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Customer customer;
}
