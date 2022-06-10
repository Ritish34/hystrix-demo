package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long userId;
    private String name;
    private String Phone;

    List<Contact> contacts=new ArrayList<>();

    public User(long userId, String name, String phone, List<Contact> contacts) {
        this.userId = userId;
        this.name = name;
        Phone = phone;
        this.contacts = contacts;
    }

    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        Phone = phone;
    }

    public User() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
