package com.turkcell.pair4project.service;

import com.turkcell.pair4project.entity.CustomerSegmentation;

import java.util.Optional;

public interface CustomerSegmentationService {
    Optional<CustomerSegmentation> findById(Integer id);
}
