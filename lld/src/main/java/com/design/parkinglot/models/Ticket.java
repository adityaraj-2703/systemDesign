package com.sysdesign.parkinglot.models;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class Ticket extends BaseModel {
    private int ticketId;
    private String vehicleId;
    private VehicleType vehicleType;
    private Integer floorNumber;
    private Integer spotNumber;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private TicketStatus status;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Integer getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(Integer spotNumber) {
        this.spotNumber = spotNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public static TicketBuilder getBuilder() {
        return new TicketBuilder();
    }

    public static class TicketBuilder {
        private int ticketId;
        private String vehicleId;
        private VehicleType vehicleType;
        private Integer floorNumber;
        private Integer spotNumber;
        private LocalDateTime entryTime;
        private LocalDateTime exitTime;
        private TicketStatus status;

        public TicketBuilder ticketId(int ticketId) {
            this.ticketId = ticketId;
            return this;
        }

        public TicketBuilder vehicleId(String vehicleId) {
            this.vehicleId = vehicleId;
            return this;
        }

        public TicketBuilder vehicleType(VehicleType vehicleType) {
            this.vehicleType = vehicleType;
            return this;
        }

        public TicketBuilder floorNumber(Integer floorNumber) {
            this.floorNumber = floorNumber;
            return this;
        }

        public TicketBuilder spotNumber(Integer spotNumber) {
            this.spotNumber = spotNumber;
            return this;
        }

        public TicketBuilder entryTime(LocalDateTime entryTime) {
            this.entryTime = entryTime;
            return this;
        }

        public TicketBuilder exitTime(LocalDateTime exitTime) {
            this.exitTime = exitTime;
            return this;
        }

        public TicketBuilder status(TicketStatus status) {
            this.status = status;
            return this;
        }

        public Ticket build() {
            Ticket ticket = new Ticket();
            ticket.setTicketId(this.ticketId);
            ticket.setVehicleId(this.vehicleId);
            ticket.setVehicleType(this.vehicleType);
            ticket.setFloorNumber(this.floorNumber);
            ticket.setSpotNumber(this.spotNumber);
            ticket.setEntryTime(this.entryTime);
            ticket.setExitTime(this.exitTime);
            ticket.setStatus(this.status);
            return ticket;
        }
    }

}
