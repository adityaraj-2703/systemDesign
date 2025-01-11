package com.lld.sysdesign.bms.repositories.interfaces;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lld.sysdesign.bms.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmail(String email);

    Optional<Customer> findByPhone(String phone);

    Optional<Customer> findByEmailOrPhone(String email, String phone);

}
