package com.sysdesign.parkinglot.service;

import java.util.List;

import com.sysdesign.parkinglot.models.Payment;
import com.sysdesign.parkinglot.models.Ticket;
import com.sysdesign.parkinglot.repository.PaymentRepository;

public class PaymentService {
    PaymentRepository paymentRepository = new PaymentRepository();

    public Integer getPaidAmount(Integer ticketId) {
        // TODO Auto-generated method stub
        int sum = 0;
        List<Payment> payments = paymentRepository.findByTicketId(ticketId);
        for (Payment payment : payments) {
            sum += payment.getAmount();
        }
        return sum;
    }

}
