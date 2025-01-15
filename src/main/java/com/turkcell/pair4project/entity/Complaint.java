package com.turkcell.pair4project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "complaints")
public class Complaint
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "description")
    private String description;

    @ManyToOne()
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne()
    @JoinColumn(name = "action_id")
    private ComplaintAction complaintAction;

    @ManyToOne()
    @JoinColumn(name = "status_tracking_id")
    private ComplaintStatusTracking complaintStatusTracking;

    @ManyToOne()
    @JoinColumn(name = "type_id")
    private ComplaintType complaintType;
}