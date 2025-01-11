package com.sysdesign.parkinglot.repository;

import java.util.ArrayList;
import java.util.List;

import com.sysdesign.parkinglot.models.ParkingSpot;
import com.sysdesign.parkinglot.models.SpotStatus;
import com.sysdesign.parkinglot.models.VehicleType;

public class ParkingSpotRepository {
    List<ParkingSpot> parkingSpots = new ArrayList<>();

    public ParkingSpot save(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
        return parkingSpot;
    }

    public ParkingSpot findOneByVehicleIdAndStatusAvailable(VehicleType type) {
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.getSpotStatus() == SpotStatus.AVAILABLE && parkingSpot.getVehicleType() == type) {
                return parkingSpot;
            }
        }
        return null;
    }

    public ParkingSpot findById(Integer spotId) {
        // TODO Auto-generated method stub
        for (ParkingSpot spot : this.parkingSpots) {
            if (spot.getSpotNumber() == spotId) {
                return spot;
            }
        }

        return null;
    }

}
