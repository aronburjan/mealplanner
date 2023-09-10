package com.example.mealplanner.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class User {
    private @Id @GeneratedValue UUID id;
    private String username;
    private String password;
    private String email;
}
