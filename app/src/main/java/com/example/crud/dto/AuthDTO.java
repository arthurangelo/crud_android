package com.example.crud.dto;

public class AuthDTO {

    private String name;
    private String token;
    private String password;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AuthDTO(String name, String token, String password , String email) {
        this.name = name;
        this.token = token;
        this.password = password;
    }



    public AuthDTO(String name, String token,String email) {
        this.name = name;
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
