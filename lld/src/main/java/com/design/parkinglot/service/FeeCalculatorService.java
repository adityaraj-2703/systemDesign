package com.sysdesign.parkinglot.service;

import com.sysdesign.parkinglot.models.Ticket;
import com.sysdesign.parkinglot.models.VehicleType;
import com.sysdesign.parkinglot.strategies.FeeCalculationStrategy;
import com.sysdesign.parkinglot.strategies.FeesCalculatorFactory;

public class FeeCalculatorService {
    public int calculateFees(Ticket ticket) {
        // Calculate fees based on vehicle type
        return FeesCalculatorFactory.getFeeCalculationStrategy(ticket.getVehicleType()).calculateFee(ticket);
    }
}
