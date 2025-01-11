package com.lld.sysdesign.bms.models;

import java.util.HashSet;
import java.util.Set;

import com.lld.sysdesign.bms.services.password.PasswordEncoder;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "USERS")
public class User extends Auditable {
    private String username;
    private String hashedSaltedPassword;

    @ManyToMany
    private Set<Role> roles = new HashSet<>();

    public User(String username) {
        this.username = username;
    }

    public void setPassword(String password, PasswordEncoder passwordEncoder) {
        if (password.length() < 8) {
            throw new RuntimeException("must have at least 8 characters");
        }
        String salt = "salt"; // from some service
        this.hashedSaltedPassword = passwordEncoder.encode(password + salt);
        this.hashedSaltedPassword += ";" + salt;
    }

    public boolean checkPassword(String password, PasswordEncoder passwordEncoder) {
        // this method checks whether the given password
        // matches the actual password
        String salt = this.hashedSaltedPassword.split(";")[1];
        // password-encoder is a dependency that we need
        String encoded = passwordEncoder.encode(password + salt) + salt;
        return encoded.equals(this.hashedSaltedPassword);
    }

    public void addRole(Role role) {
        this.roles.add(role);
    }

}
