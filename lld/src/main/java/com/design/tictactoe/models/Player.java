package com.sysdesign.tictactoe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@SuperBuilder(toBuilder = true)
public abstract class Player {
    private GameSymbol symbol;
    public abstract BoardCell makeMove(Board b);
    public GameSymbol getSymbol() {
        return symbol;
    }
    public void setSymbol(GameSymbol symbol) {
        this.symbol = symbol;
    }

    
}
