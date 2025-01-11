package com.sysdesign.snakesAndLadders.service;

import java.util.ArrayList;
import java.util.List;

import com.sysdesign.snakesAndLadders.models.Board;
import com.sysdesign.snakesAndLadders.models.Dice;
import com.sysdesign.snakesAndLadders.models.Game;
import com.sysdesign.snakesAndLadders.models.GameRequest;
import com.sysdesign.snakesAndLadders.repository.GameRepository;

public class GameService {
    GameRepository gRepo = new GameRepository();

    public Game createGame(GameRequest gameRequest) {
        //Game game = initialiseGame(gameRequest);
        //return gRepo.save(game);
        return null;
    }
    
    
}
