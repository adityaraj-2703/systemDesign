package com.sysdesign.snakesAndLadders.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Game {
    private Integer id;
    private Board board;
    private List<Player> players = new ArrayList<>();
    private List<Dice> dices = new ArrayList<>();
    public int rollDice(){
        int rollValue = 0;
        for(Dice dice : this.dices){
            
            rollValue += dice.roll();
        }
        return rollValue;
    }

    

}
