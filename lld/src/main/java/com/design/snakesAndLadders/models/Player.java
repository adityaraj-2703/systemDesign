package com.sysdesign.snakesAndLadders.models;

import java.util.ArrayList;
import java.util.List;

import com.sysdesign.tictactoe.models.User;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Player {

   private Color color;
   private User user;

   @Builder.Default
   private List<Piece> pieces = new ArrayList<>();
}
