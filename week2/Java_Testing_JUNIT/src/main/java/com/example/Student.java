package com.example;

public class Student {
    private Address address; // dependency

    // Setter Injection
    public void setAddress(Address address) {
        this.address = address;
    }

    public void show() {
        System.out.println("Student Info:");
        address.display();
    }
}
