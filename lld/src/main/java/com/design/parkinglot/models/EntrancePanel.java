package com.sysdesign.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

public class EntrancePanel extends Gate {
    private DisplayBoard displayBoard;

    public DisplayBoard getDisplayBoard() {
        return displayBoard;
    }

    public void setDisplayBoard(DisplayBoard displayBoard) {
        this.displayBoard = displayBoard;
    }

}
