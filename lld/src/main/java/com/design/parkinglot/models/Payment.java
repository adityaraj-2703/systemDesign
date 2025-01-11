package com.sysdesign.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

public class Payment {
    private String ticketId;
    private Integer amount;
    private String mode;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

}
