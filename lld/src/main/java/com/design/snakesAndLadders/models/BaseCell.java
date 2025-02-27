package com.sysdesign.snakesAndLadders.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public class BaseCell extends Cell{
    public Integer getNextPosition(){
        return getIndex();
    }
    
}
