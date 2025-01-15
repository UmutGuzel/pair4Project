package com.turkcell.pair4project.dto.customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCustomerDTO {
    private String telephoneNumber;
    private String email;
    private int subscriptionId;
    private int segmentationId;
}
