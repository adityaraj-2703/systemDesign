package com.sysdesign.snakesAndLadders.models;

public class Client {
    public static void main(String[] args) {

        User u = User.getBuilder().id(1).email("1").username("1").build();
        System.out.println(u.getUsername());
    }
}
