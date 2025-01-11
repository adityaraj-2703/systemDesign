package com.sysdesign.tictactoe.models;

import com.sysdesign.tictactoe.strategies.PlayingStrategy;
import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
public class Bot extends Player{
    
    private PlayingStrategy playingStrategy;

    @Override
    public BoardCell makeMove(Board b) {
        // TODO
        return playingStrategy.makeMode(b);
    }

    public PlayingStrategy getPlayingStrategy() {
        return playingStrategy;
    }

    public void setPlayingStrategy(PlayingStrategy playingStrategy) {
        this.playingStrategy = playingStrategy;
    }
    
}
