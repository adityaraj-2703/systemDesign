package com.sysdesign.parkinglot.strategies;

import java.time.Duration;
import java.time.LocalDateTime;

import com.sysdesign.parkinglot.models.Ticket;

public class SmallVehicleStrategy implements FeeCalculationStrategy {

    @Override
    public int calculateFee(Ticket ticket) {
        // TODO Auto-generated method stub
        LocalDateTime entryDate = ticket.getEntryTime();

        // Current date and time
        LocalDateTime now = LocalDateTime.now();

        // Calculate the duration between the two dates
        Duration duration = Duration.between(entryDate, now);

        // Get the total hours
        long totalHours = duration.toHours();
        if (totalHours < 1) {
            return 10;
        } else {
            return 10 + (int) (totalHours - 1) * 30;
        }
    }

}
