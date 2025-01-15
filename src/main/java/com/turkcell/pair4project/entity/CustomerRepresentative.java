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
@Table(name = "customer_representatives")
public class CustomerRepresentative
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "position")
    private String position;

    @ManyToOne()
    @JoinColumn(name = "roles_id")
    private EmployeeRole employeeRole;

    @OneToMany(mappedBy = "customerRepresentative", cascade = CascadeType.ALL)
    private List<ComplaintStatusTracking> complaintStatusTracking;

    @OneToMany(mappedBy = "customerRepresentative", cascade = CascadeType.ALL)
    private List<Report> reports;

    @OneToMany(mappedBy = "customerRepresentative", cascade = CascadeType.ALL)
    private List<Support> support;
}
