package com.sysdesign.parkinglot.repository;

import java.util.ArrayList;
import java.util.List;

import com.sysdesign.parkinglot.models.Ticket;

public class TicketRepository {
    private List<Ticket> tickets = new ArrayList<>();

    public Ticket save(Ticket ticket) {
        tickets.add(ticket);
        return ticket;
    }
}
