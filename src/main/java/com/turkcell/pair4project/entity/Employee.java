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
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;

    @ManyToOne
    @JoinColumn(name = "roles_id")
    private Roles roles;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_activity_logs_id")
    private KeepingUserActivityLog keeping_user_activity_logs;
}
