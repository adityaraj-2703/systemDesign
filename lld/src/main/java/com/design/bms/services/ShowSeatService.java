package com.lld.sysdesign.bms.services;

import org.springframework.stereotype.Service;

import com.lld.sysdesign.bms.models.ShowSeat;

@Service
public class ShowSeatService {
    public boolean isOccupied(ShowSeat showSeat) {
        return false;
    }

    public void save(ShowSeat showSeat) {
    }

}
