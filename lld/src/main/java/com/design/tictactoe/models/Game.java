package com.sysdesign.tictactoe.models;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {
    private String name;
    private List<Player> players = new ArrayList<>();
    private Board board;

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Game createGame(List<Player> players, Board board){
        return null;
    }

    public static Builder getBuilder() {
        return new Builder();
    }


    public static class Builder{
        private Game game;
        Builder(){
            this.game = new Game();

        }

        public Builder builderwithDimension(int row,int column){
            Board b = new Board(row, column);
            this.game.setBoard(b);
            return this;
        }
        public boolean validate(){
            List<Player> players = game.getPlayers();
            if(players.size() > 2){
                return false;
            }
            return true;
        }
        public Game build(){
            boolean isValid = validate();
            if(!isValid){
                throw new RuntimeException("Game is ot valid");

            }
            return this.game;

        }
        public Builder withPlayer(Player player){
            game.getPlayers().add(player);
            return this;
        }
    }

}
