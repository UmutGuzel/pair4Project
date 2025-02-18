package com.turkcell.pair4project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "situations")
public class InvoiceSituation {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="late_penalties")
    private BigDecimal latePenalties;
    @Column(name="discount")
    private BigDecimal discount;

    @OneToOne(mappedBy = "invoiceSituation", cascade = CascadeType.ALL)
    private InvoiceStatus invoiceStatus;
}
