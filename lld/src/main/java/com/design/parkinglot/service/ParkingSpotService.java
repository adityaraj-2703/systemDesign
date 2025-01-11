package com.sysdesign.parkinglot.service;

import com.sysdesign.parkinglot.models.ParkingSpot;
import com.sysdesign.parkinglot.repository.ParkingSpotRepository;

public class ParkingSpotService {
    private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public void markSlotBooked(ParkingSpot spot) {
        parkingSpotRepository.save(spot);
    }

    public ParkingSpot getParkingSpot(Integer spotId) {
        return parkingSpotRepository.findById(spotId);
    }

    public void save(ParkingSpot spot) {
        parkingSpotRepository.save(spot);
    }

}
