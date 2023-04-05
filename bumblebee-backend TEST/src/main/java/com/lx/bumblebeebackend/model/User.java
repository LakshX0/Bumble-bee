package com.lx.bumblebeebackend.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usergenerator")
    @SequenceGenerator(name="usergenerator", sequenceName="usersequence")
    private int id;
    private String name;
    private String address;
    private String email;

    public long getId() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
