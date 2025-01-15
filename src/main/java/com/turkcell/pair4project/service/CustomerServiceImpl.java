package com.turkcell.pair4project.service;

import com.turkcell.pair4project.dto.customer.CreateCustomerDTO;
import com.turkcell.pair4project.dto.customer.CustomerDTO;
import com.turkcell.pair4project.dto.customer.UpdateCustomerDTO;
import com.turkcell.pair4project.entity.Customer;
import com.turkcell.pair4project.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerSegmentationService customerSegmentationService;
    private final SubscriptionService subscriptionService;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerSegmentationService customerSegmentationService, SubscriptionService subscriptionService) {
        this.customerRepository = customerRepository;
        this.customerSegmentationService = customerSegmentationService;
        this.subscriptionService = subscriptionService;
    }

    @Override
    public void add(CreateCustomerDTO createCustomerDTO) {
        Customer customer = new Customer();
        customer.setTelephoneNumber(createCustomerDTO.getTelephoneNumber());
        customer.setEmail(createCustomerDTO.getEmail());

        customerSegmentationService
                .findById(createCustomerDTO.getSegmentationId())
                .ifPresent(customer::setCustomerSegmentation);
        subscriptionService
                .findById(createCustomerDTO.getSubscriptionId())
                .ifPresent(customer::setSubscription);

        customerRepository.save(customer);
    }

    @Override
    public List<CustomerDTO> getAll() {
        return List.of();
    }

    @Override
    public Optional<CustomerDTO> getById(int id) {
        return Optional.empty();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(UpdateCustomerDTO updateCustomerDTO) {

    }
}
