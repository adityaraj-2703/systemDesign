package com.sysdesign.parkinglot.repository;

import java.util.ArrayList;
import java.util.List;

import com.sysdesign.parkinglot.models.ParkingSpot;
import com.sysdesign.parkinglot.models.Payment;

public class PaymentRepository {
    List<Payment> payments = new ArrayList<>();

    public Payment save(Payment payment) {
        payments.add(payment);
        return payment;
    }

    public List<Payment> findByTicketId(Integer ticketId) {
        List<Payment> result = new ArrayList<>();
        for (Payment payment : payments) {
            if (payment.getTicketId().equals(ticketId)) {
                result.add(payment);
            }
        }
        return result;
    }

}
