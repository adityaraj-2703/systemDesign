package com.sysdesign.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

public class BoardCell {
    private Integer row;
    private Integer column;
    private GameSymbol gameSymbol;
    public Integer getRow() {
        return row;
    }
    public void setRow(Integer row) {
        this.row = row;
    }
    public Integer getColumn() {
        return column;
    }
    public void setColumn(Integer column) {
        this.column = column;
    }
    public GameSymbol getGameSymbol() {
        return gameSymbol;
    }
    public void setGameSymbol(GameSymbol gameSymbol) {
        this.gameSymbol = gameSymbol;
    }
    
}
