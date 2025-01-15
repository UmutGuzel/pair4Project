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
@Table(name = "campaign_notifications")
public class CampaignNotification {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "status")
    private String status;

    @OneToOne
    @JoinColumn(name="campaigns_id")
    private Campaign campaign;

    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "id")
    private Notification notification;

}
