package com.lld.sysdesign.bms.dto;

import lombok.NonNull;

public class CreateUserDTO {
    @NonNull
    private String username;
    @NonNull
    private String password;

    @NonNull
    private String roleName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
