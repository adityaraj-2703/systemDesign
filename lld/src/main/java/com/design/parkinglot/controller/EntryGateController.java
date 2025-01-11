package com.sysdesign.parkinglot.controller;

import com.sysdesign.parkinglot.dto.GetTicketDTO;
import com.sysdesign.parkinglot.models.Ticket;
import com.sysdesign.parkinglot.models.VehicleType;
import com.sysdesign.parkinglot.service.EntryGateService;

public class EntryGateController {
    private EntryGateService entryGateService = new EntryGateService();

    public GetTicketDTO createTicket(VehicleType vehicleType) {
        return entryGateService.createTicket(vehicleType);
    }

}
