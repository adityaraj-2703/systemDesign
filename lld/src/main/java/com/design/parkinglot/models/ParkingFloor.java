package com.sysdesign.parkinglot.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class ParkingFloor extends BaseModel {
    private Integer floorNumber;
    private String name;
    private List<ParkingSpot> parkingSpots;

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

}
