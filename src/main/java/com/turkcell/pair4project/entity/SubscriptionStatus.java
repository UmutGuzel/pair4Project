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
@Table(name = "subscription_statuses")
public class SubscriptionStatus {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="situation_subscription")
    private String situationSubscription;

    @OneToMany(mappedBy = "subscriptionStatus", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubscriptionType> subscriptionTypes;



}
