package com.sysdesign.parkinglot.service;

import com.sysdesign.parkinglot.models.ParkingSpot;
import com.sysdesign.parkinglot.models.Payment;
import com.sysdesign.parkinglot.models.SpotStatus;
import com.sysdesign.parkinglot.models.Ticket;
import com.sysdesign.parkinglot.models.TicketStatus;

public class ExitGateService {
    FeeCalculatorService feeCalculatorService = new FeeCalculatorService();
    PaymentService paymentService = new PaymentService();
    ParkingSpotService parkingSpotService = new ParkingSpotService();

    public void exitCustomer(Ticket ticket, Integer paymentAccepted) {
        int actualFees = feeCalculatorService.calculateFees(ticket);
        TicketStatus ticketStatus = ticket.getStatus();
        if (ticketStatus == TicketStatus.DONE) {
            Integer paid = paymentService.getPaidAmount(ticket.getTicketId());
            paid = paid + paymentAccepted;
            if (paid < actualFees) {
                throw new RuntimeException("Insufficient payment");
            }
            checkoutCustomer(ticket);
        }
    }

    private void checkoutCustomer(Ticket ticket) {
        ParkingSpot spot = parkingSpotService.getParkingSpot(ticket.getSpotNumber());
        spot.setSpotStatus(SpotStatus.AVAILABLE);
        parkingSpotService.save(spot);
    }
}
