package com.example.mealplanner.User;

import com.example.mealplanner.Nutrient.Nutrient;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.HashMap;
import java.util.UUID;

@Entity
public class UserDetails {
    private @Id @GeneratedValue UUID id;

    private int age;
    private int height;
    private int weight;
    private enum sex{
        female,
        male
    }
    private enum goal{
        lose,
        maintain,
        gain
    }

    private HashMap<Nutrient, Integer> nutrientLimits;
}
