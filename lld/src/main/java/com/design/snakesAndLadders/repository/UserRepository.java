package com.sysdesign.snakesAndLadders.repository;

import java.util.ArrayList;
import java.util.List;

import com.sysdesign.snakesAndLadders.models.User;

public class UserRepository {
    List<User> users = new ArrayList<>();

    public User save(User user) {
        this.users.add(user);
        return user;
    }
}
