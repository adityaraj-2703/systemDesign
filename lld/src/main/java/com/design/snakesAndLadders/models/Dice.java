package com.sysdesign.snakesAndLadders.models;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Dice {
    private Integer faces;
    public int roll(){
        return (int)(Math.random() *faces)+1;
    }
   
    
}
