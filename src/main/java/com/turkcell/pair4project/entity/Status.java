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
@Table(name = "statuses")
public class Status {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="paid_invoice_id")
    private Integer paidInvoiceId;

    @OneToOne(mappedBy = "status", cascade = CascadeType.ALL)
    private Invoice invoice;

    @OneToOne
    @JoinColumn(name = "unpaid_invoice_id")
    private Situation situation;
}
