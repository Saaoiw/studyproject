package com.brainacad.studyproject.data.domain;

/**
 * Created by Fujitsu on 01.11.2016.
 */
public class User {

    private String username;
    private String password;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
