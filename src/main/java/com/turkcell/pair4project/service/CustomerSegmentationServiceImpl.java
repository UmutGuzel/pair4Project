package com.turkcell.pair4project.service;

import com.turkcell.pair4project.entity.CustomerSegmentation;
import com.turkcell.pair4project.repository.CustomerSegmentationRepository;

import java.util.Optional;

public class CustomerSegmentationServiceImpl implements CustomerSegmentationService {
    private final CustomerSegmentationRepository customerSegmentationRepository;

    public CustomerSegmentationServiceImpl(CustomerSegmentationRepository customerSegmentationRepository) {
        this.customerSegmentationRepository = customerSegmentationRepository;
    }

    @Override
    public Optional<CustomerSegmentation> findById(Integer id) {
        return customerSegmentationRepository.findById(id);
    }
}
