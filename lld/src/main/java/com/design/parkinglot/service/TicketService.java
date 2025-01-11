package com.sysdesign.parkinglot.service;

import java.time.LocalDateTime;

import com.sysdesign.parkinglot.models.ParkingSpot;
import com.sysdesign.parkinglot.models.Ticket;
import com.sysdesign.parkinglot.models.VehicleType;
import com.sysdesign.parkinglot.repository.TicketRepository;

public class TicketService {
    private TicketRepository ticketRepository = new TicketRepository();

    public Ticket createTicket(VehicleType vehicleType, ParkingSpot spot) {
        Ticket ticket = Ticket.getBuilder().entryTime(LocalDateTime.now()).floorNumber(spot.getFloorNumber())
                .spotNumber(spot.getSpotNumber()).vehicleType(vehicleType).build();
        return ticketRepository.save(ticket);

    }

}
