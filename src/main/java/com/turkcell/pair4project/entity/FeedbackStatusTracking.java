package com.turkcell.pair4project.entity;

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
@Table(name = "feedback_status_tracking")
public class FeedbackStatusTracking
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "success_status_tracking")
    private String successStatusTracking;

    @ManyToOne()
    @JoinColumn(name = "customer_representative_id")
    private CustomerRepresentative customerRepresentative;

    @OneToMany(mappedBy = "feedbackStatusTracking", cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;
}
