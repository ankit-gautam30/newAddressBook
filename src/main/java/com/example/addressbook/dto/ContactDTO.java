package com.example.addressbook.dto;

public class ContactDTO {
    private String name;
    private String email;
    private String phone;
    private String address;

    // Default constructor
    public ContactDTO() {}

    // Parameterized constructor
    public ContactDTO(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for email
    public String getEmail() {
        return email;
    }

    // Setter method for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter method for phone number
    public String getPhone() {
        return phone;
    }

    // Setter method for phone number
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getter method for address
    public String getAddress() {
        return address;
    }

    // Setter method for address
    public void setAddress(String address) {
        this.address = address;
    }



}