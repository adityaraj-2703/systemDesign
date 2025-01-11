package com.lld.sysdesign.bms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "SHOW_SEATS")
public class ShowSeat extends Auditable {

    @ManyToOne
    private HallSeat hallSeat;

    @ManyToOne
    private Show show;

    @ManyToOne
    private Booking booking;
    private boolean occupied;

}
