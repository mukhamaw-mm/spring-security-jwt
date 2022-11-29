package com.mk.springsecurityjwt.models;

public class AuthenticationRequest {
    private String username;
    private String password;

    //need default constructor for JSON Parsing
    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String userName, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
