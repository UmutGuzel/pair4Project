package com.turkcell.pair4project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "employee_roles")
public class EmployeeRole
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "authorization_control")
    private String authorizationControl;

    @Column(name = "access_control")
    private String accessControl;

    @OneToMany(mappedBy = "employeeRole", cascade = CascadeType.ALL)
    private List<CustomerRepresentative> customerRepresentatives;

    @OneToMany(mappedBy = "employeeRole", cascade = CascadeType.ALL)
    private List<Employee> employees;
}