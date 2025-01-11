package com.sysdesign.parkinglot.dto;

import java.time.LocalDateTime;

import com.sysdesign.parkinglot.models.VehicleType;

public class GetTicketDTO {
    private final VehicleType vehicleType;
    private final LocalDateTime entryTime;

    private GetTicketDTO(Builder b) {
        this.vehicleType = b.vehicleType;
        this.entryTime = b.entryTime;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public static Builder getbuilder() {
        return new Builder();
    }

    public static class Builder {
        private VehicleType vehicleType;
        private LocalDateTime entryTime;

        private Builder() {
        }

        public Builder vehicleType(VehicleType vehicleType) {
            this.vehicleType = vehicleType;
            return this;
        }

        public Builder entryTime(LocalDateTime entryTime) {
            this.entryTime = entryTime;
            return this;
        }

        public GetTicketDTO build() {
            return new GetTicketDTO(this);
        }
    }
}

// dto is a data transfer object that is used to encapsulate data and send it
// from one subsystem of an application to another.
// It is also used to hold the data that is sent from the client to the server.
// In this case, the GetTicketDTO is used to hold the data that is sent from the
// client to the server when a ticket is requested.
// The GetTicketDTO has two fields: vehicleType and entryTime.
// The vehicleType field is of type VehicleType, which is an enum that
// represents the type of vehicle that is requesting the ticket.
// The entryTime field is of type LocalDateTime, which is a class that
// represents a date and time.
// The GetTicketDTO class has a builder method that is used to create instances
// of the class. The class