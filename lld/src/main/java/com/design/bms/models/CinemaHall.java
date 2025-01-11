package com.lld.sysdesign.bms.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class CinemaHall extends Auditable {
    private String hallNumber;
    private Integer seatCount;

    @ManyToOne
    private Cinema cinema;

    @OneToMany(mappedBy = "cinemaHall")
    private List<HallSeat> hallSeats = new ArrayList<>();
    @OneToMany(mappedBy = "cinemaHall")
    private List<Show> shows = new ArrayList<>();
}
