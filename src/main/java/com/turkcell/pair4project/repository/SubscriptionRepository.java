package com.turkcell.pair4project.repository;

import com.turkcell.pair4project.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {
}
