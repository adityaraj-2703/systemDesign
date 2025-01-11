package com.sysdesign.parkinglot.service;

import com.sysdesign.parkinglot.models.ParkingSpot;
import com.sysdesign.parkinglot.models.VehicleType;
import com.sysdesign.parkinglot.repository.ParkingSpotRepository;

public class SlotAllocationService {
    private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public ParkingSpot allocateSlot(VehicleType type) {
        return parkingSpotRepository.findOneByVehicleIdAndStatusAvailable(type);
    }
}
