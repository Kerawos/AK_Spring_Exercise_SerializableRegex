package pl.akademiakodu.AK_Spring_Exercise_SerializableRegex.models;

public class UserRegisterInput {
    private String name;
    private String surName;
    private String email;
    private String street;
    private String streetpassword;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetpassword() {
        return streetpassword;
    }

    public void setStreetpassword(String streetpassword) {
        this.streetpassword = streetpassword;
    }
}
