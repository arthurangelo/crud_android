package com.example.crud.dto;

public class UserDTO {

    private String email;
    private int id;
    private String name;
    private String password;
    private String phone;

    /**
     * No args constructor for use in serialization
     *
     */
    public UserDTO() {
    }

    /**
     *
     * @param id
     * @param phone
     * @param email
     * @param name
     * @param password
     */
    public UserDTO(String email, int id, String name, String password, String phone) {
        super();
        this.email = email;
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    public UserDTO(String email, String name, String password, String phone) {
        super();
        this.email = email;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}