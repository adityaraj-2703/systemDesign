package com.lld.sysdesign.bms.repositories.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lld.sysdesign.bms.models.Booking;
import com.lld.sysdesign.bms.models.Customer;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> getBookingsByCustomer(Customer customer);
}
