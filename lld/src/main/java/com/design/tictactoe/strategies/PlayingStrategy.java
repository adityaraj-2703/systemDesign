package com.sysdesign.tictactoe.strategies;
import com.sysdesign.tictactoe.models.Board;
import com.sysdesign.tictactoe.models.BoardCell;

public interface PlayingStrategy {
    public BoardCell makeMode(Board board);
}
