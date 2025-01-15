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
@Table(name = "reports")
public class Report
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @ManyToOne()
    @JoinColumn(name = "customer_representative_id")
    private CustomerRepresentative customerRepresentative;
}
