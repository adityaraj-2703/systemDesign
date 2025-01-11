package com.sysdesign.parkinglot.service;

import com.sysdesign.parkinglot.dto.GetTicketDTO;
import com.sysdesign.parkinglot.models.ParkingSpot;
import com.sysdesign.parkinglot.models.SpotStatus;
import com.sysdesign.parkinglot.models.Ticket;
import com.sysdesign.parkinglot.models.VehicleType;

public class EntryGateService {

    SlotAllocationService slotAllocationService = new SlotAllocationService();
    ParkingSpotService parkingSpotService = new ParkingSpotService();
    TicketService ticketService = new TicketService();

    public GetTicketDTO createTicket(VehicleType vehicleType) {
        // TODO Auto-generated method stub
        // check if slot available

        ParkingSpot spot = slotAllocationService.allocateSlot(vehicleType);
        if (spot == null) {
            throw new RuntimeException("No slot available");
        }
        // mark the slot as booked and store in the database
        spot.setSpotStatus(SpotStatus.FILLED);
        parkingSpotService.markSlotBooked(spot);
        // create a ticket
        Ticket ticket = ticketService.createTicket(vehicleType, spot);
        return GetTicketDTO.getbuilder().entryTime(ticket.getEntryTime()).vehicleType(ticket.getVehicleType())
                .build();
    }

}
