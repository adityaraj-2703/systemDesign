package com.lld.sysdesign.bms.services;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lld.sysdesign.bms.dto.CreateBookingDTO;
import com.lld.sysdesign.bms.models.Booking;
import com.lld.sysdesign.bms.models.Customer;
import com.lld.sysdesign.bms.models.ShowSeat;
import com.lld.sysdesign.bms.repositories.interfaces.BookingRepository;

@Service
public class BookingService {
    @Autowired
    private ShowSeatService showSeatService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private BookingRepository bookingRepository;

    private Lock lock = new ReentrantLock();

    public Booking bookTicket(CreateBookingDTO bookingRequest) {

        // Validate if booking is open
        lock.lock();
        try {

            if (!bookingRequest.getShow().isShowPending()) {
                throw new RuntimeException("Booking for this movie is closed!");
            }
            // critical section - check if seat is avaialble and the act of booking it.
            // =======Critical Section Starts===========

            // Check if seat is occupied
            boolean isOccupied = checkIfSeatIsOccupied(bookingRequest.getShowSeats());
            // Early returns
            if (isOccupied) {
                throw new RuntimeException("Seat is already booked!");
            }

            // Go ahead and book
            // Mark the seat as FILLED
            for (ShowSeat seat : bookingRequest.getShowSeats()) {
                seat.setOccupied(true);
                showSeatService.save(seat);
            }
        } finally {
            lock.unlock();
        }

        // =======Critical Section Ends===========

        // Create and persist booking
        Customer customer = customerService.getCustomer(bookingRequest.getCustomerId());
        Booking booking = new Booking(customer, bookingRequest.getShow());
        booking.setSeatsBooked(bookingRequest.getShowSeats());
        return bookingRepository.save(booking);
    }

    public boolean checkIfSeatIsOccupied(List<ShowSeat> seats) {
        for (ShowSeat seat : seats) {
            if (showSeatService.isOccupied(seat)) {
                return true;
            }
        }
        return false;
    }

}
