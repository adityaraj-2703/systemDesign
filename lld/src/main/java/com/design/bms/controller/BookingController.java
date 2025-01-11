package com.lld.sysdesign.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.lld.sysdesign.bms.dto.CreateBookingDTO;
import com.lld.sysdesign.bms.models.Booking;
import com.lld.sysdesign.bms.services.BookingService;

public class BookingController {
    @Autowired
    BookingService bookingService;

    @GetMapping("/book")
    public Booking bookTicket(CreateBookingDTO bookingRequest) {
        return bookingService.bookTicket(bookingRequest);
    }

}
