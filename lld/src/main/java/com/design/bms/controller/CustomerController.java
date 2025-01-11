package com.lld.sysdesign.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lld.sysdesign.bms.dto.CreateCustomerDTO;
import com.lld.sysdesign.bms.models.Customer;
import com.lld.sysdesign.bms.services.CustomerService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody CreateCustomerDTO customerRequest) {
        return customerService.createCustomer(customerRequest);
    }

}
