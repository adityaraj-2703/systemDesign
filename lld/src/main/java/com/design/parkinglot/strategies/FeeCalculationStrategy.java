package com.sysdesign.parkinglot.strategies;

import com.sysdesign.parkinglot.models.Ticket;

public interface FeeCalculationStrategy {
    int calculateFee(Ticket ticket);
}
