package com.turkcell.pair4project.service;

import com.turkcell.pair4project.entity.Subscription;
import com.turkcell.pair4project.repository.SubscriptionRepository;

import java.util.Optional;

public class SubscriptionServiceImpl implements SubscriptionService {
    private final SubscriptionRepository subscriptionRepository;
    public  SubscriptionServiceImpl(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }
    @Override
    public Optional<Subscription> findById(Integer id) {
        return subscriptionRepository.findById(id);
    }
}
