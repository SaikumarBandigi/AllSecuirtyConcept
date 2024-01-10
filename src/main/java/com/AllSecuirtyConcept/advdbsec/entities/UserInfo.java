package com.AllSecuirtyConcept.advdbsec.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String fullname;

    @Id
    private String name;

    private String password;

    private String country;

    private int enabled;

    private String role;


    public UserInfo() {
    }

    public UserInfo(String fullname, String name, String password, String country, int enabled, String role) {
        this.fullname = fullname;
        this.name = name;
        this.password = password;
        this.country = country;
        this.enabled = enabled;
        this.role = role;
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "fullname='" + fullname + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", country='" + country + '\'' +
                ", enabled=" + enabled +
                ", role='" + role + '\'' +
                '}';
    }
}
