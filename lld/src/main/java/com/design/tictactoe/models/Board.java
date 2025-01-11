package com.sysdesign.tictactoe.models;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Board {
    private List<List<BoardCell>> cells = new ArrayList<>();

    public Board(int rows,int columns){
        List<BoardCell> rowCells = Collections.nCopies(columns, new BoardCell());
        List<List<BoardCell>> columnCells = Collections.nCopies(rows, rowCells);
        this.cells = columnCells;
    }

    public List<List<BoardCell>> getCells() {
        return cells;
    }

    public void setCells(List<List<BoardCell>> cells) {
        this.cells = cells;
    }
    
}
