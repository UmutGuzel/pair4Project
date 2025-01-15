package com.turkcell.pair4project.service;

import com.turkcell.pair4project.dto.customer.CreateCustomerDTO;
import com.turkcell.pair4project.dto.customer.CustomerDTO;
import com.turkcell.pair4project.dto.customer.UpdateCustomerDTO;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    void add(CreateCustomerDTO createCustomerDTO);
    List<CustomerDTO> getAll();
    Optional<CustomerDTO> getById(int id);
    void delete(int id);
    void update(UpdateCustomerDTO updateCustomerDTO);
}
