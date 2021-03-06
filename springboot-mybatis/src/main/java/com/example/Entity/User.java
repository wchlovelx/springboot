package com.example.Entity;


import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class User {
    private  int id;
    private String username;
    private String password;
    private String phone;
    @JSONField(format="yyyyMMdd")
    private Date date;


    public User( String username, String password, String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
