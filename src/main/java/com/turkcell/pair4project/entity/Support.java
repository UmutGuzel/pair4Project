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
@Table(name = "support")
public class Support
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "customer_representative_id")
    private CustomerRepresentative customerRepresentative;

    @ManyToOne
    @JoinColumn(name = "request_status_id")
    private SupportRequestStatus supportRequestStatus;

    @ManyToOne
    @JoinColumn(name = "request_status_type")
    private SupportRequestType supportRequestType;
}

