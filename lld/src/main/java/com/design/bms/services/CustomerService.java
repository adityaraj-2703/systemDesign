package com.lld.sysdesign.bms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lld.sysdesign.bms.dto.CreateCustomerDTO;
import com.lld.sysdesign.bms.dto.CreateUserDTO;
import com.lld.sysdesign.bms.models.Customer;
import com.lld.sysdesign.bms.models.User;
import com.lld.sysdesign.bms.repositories.interfaces.CustomerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private UserService userService;

    public Customer createCustomer(CreateCustomerDTO customerRequest) {
        if (userService.doesUserExist(customerRequest.getUsername(), customerRequest.getEmail())) {
            throw new IllegalArgumentException("Username already exists");
        }

        User user = userService.createUser(
                new CreateUserDTO(customerRequest.getUsername(), customerRequest.getPassword(), "CUSTOMER"));

        Customer customer = Customer
                .builder()
                .city(customerRequest.getCity())
                .email(customerRequest.getEmail())
                .phone(customerRequest.getPhone())
                .user(user)
                .build();
        return customerRepository.save(customer);
    }

    public Customer getCustomer(Long customerId) {
        return customerRepository.getById(customerId);
    }
}
