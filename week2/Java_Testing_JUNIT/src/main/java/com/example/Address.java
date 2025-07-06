package com.example;

public class Address {
    private String city;

    public void setCity(String city) {
        this.city = city;
    }

    public void display() {
        System.out.println("City: " + city);
    }
}
