package com.turkcell.pair4project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "invoices")
public class Invoice {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="date")
    private Date date;
    @Column(name="deadline")
    private Date deadline;
    @Column(name="price")
    private BigDecimal price;

    @OneToMany(mappedBy = "invoice")
    private List<Subscription> payments;

    @OneToOne
    @JoinColumn(name = "payment_status_id")
    private Status status;
}
