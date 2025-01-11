package com.lld.sysdesign.bms.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "HALL_SEATS")
public class HallSeat extends Auditable {
    private String seatLocation;
    private String seatType;
    private boolean isUnderMaintenance;

    @ManyToOne
    private CinemaHall cinemaHall;

    @OneToMany(mappedBy = "hallSeat")
    private List<ShowSeat> showSeats = new ArrayList<>();
}
