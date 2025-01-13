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
@Table(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name="name")
    private String name;
    @Column(name="authorization_control")
    private String authorization_control;
    @Column(name="access_control")
    private String access_control;

    @OneToMany(mappedBy = "roles")
    @JsonIgnore
    private List<Employee> employees;
}
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "roles")
//public class Roles {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name ="id")
//    private Integer id;
//
//    @Column(name="name")
//    private String name;
//    @Column(name="authorization_control")
//    private String authorization_control;
//    @Column(name="access_control")
//    private String access_control;
//}
