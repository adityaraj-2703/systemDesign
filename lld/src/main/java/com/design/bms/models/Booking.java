package com.lld.sysdesign.bms.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "BOOKINGS")
public class Booking extends Auditable {
    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Show show;
    private BookingStatus status;

    @OneToMany(mappedBy = "booking")
    List<ShowSeat> seatsBooked = new ArrayList<>();

    public Booking() {
    }

    public Booking(Customer customer, Show show) {
        this.customer = customer;
        this.show = show;
        this.status = BookingStatus.PAYMENT_PENDING;
    }

}
