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
@Table(name = "promotion_notifications")
public class PromotionNotification {
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="status")
    private String status;
    @ManyToOne
    @JoinColumn(name="promotions_id")
    private Promotion promotion;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Notification notification;
}
