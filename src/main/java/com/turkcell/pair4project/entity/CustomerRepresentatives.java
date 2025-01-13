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
@Table(name = "customer_representatives")
public class CustomerRepresentatives {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;
    @Column(name="representative_name")
    private String name;
    @Column(name="representative_surname")
    private String surname;
    @Column(name="position")
    private String position;
}
