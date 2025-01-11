package com.sysdesign.parkinglot.strategies;

import com.sysdesign.parkinglot.models.VehicleType;

public class FeesCalculatorFactory {
    public static FeeCalculationStrategy getFeeCalculationStrategy(VehicleType vehicleType) {
        switch (vehicleType) {
            case SMALL:
                return new SmallVehicleStrategy();
            case MEDIUM:
                return new MediumVehicleStrategy();
            case LARGE:
                return new LargeVehicleStrategy();
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }

    }
}
