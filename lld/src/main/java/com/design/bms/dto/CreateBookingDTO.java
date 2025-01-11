package com.lld.sysdesign.bms.dto;

import java.util.ArrayList;
import java.util.List;

import com.lld.sysdesign.bms.models.Show;
import com.lld.sysdesign.bms.models.ShowSeat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CreateBookingDTO {
    private Long customerId;
    private Show show;
    private List<ShowSeat> showSeats = new ArrayList<>();
}
