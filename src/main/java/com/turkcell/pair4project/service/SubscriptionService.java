package com.turkcell.pair4project.service;

import com.turkcell.pair4project.entity.Subscription;

import java.util.Optional;

public interface SubscriptionService {
    Optional<Subscription> findById(Integer id);
}
