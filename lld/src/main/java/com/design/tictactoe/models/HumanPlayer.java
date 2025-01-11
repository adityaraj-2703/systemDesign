package com.sysdesign.tictactoe.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public class HumanPlayer extends Player{

    private User user;

    @Override
    public BoardCell makeMove(Board b) {
        // TODO
        return null;
    }

    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }
    
}
