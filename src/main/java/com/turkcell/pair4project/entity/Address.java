package com.turkcell.pair4project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;
    @Column(name="city")
    private String city;
    @Column(name="street")
    private String street;
    @Column(name="state")
    private String state;
    @Column(name="postal_code")
    private String postal_code;
    @Column(name="door_number")
    private String door_number;
}
