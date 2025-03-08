package com.example.addressbook.model;

import com.example.addressbook.dto.ContactDTO;
import jakarta.persistence.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;

    // Default constructor
    public Contact() {}

    // Constructor with fields
    public Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // **New constructor to accept ContactDTO**
    public Contact(ContactDTO contactDTO) {
        this.name = contactDTO.getName();
        this.email = contactDTO.getEmail();
        this.phone = contactDTO.getPhone();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
