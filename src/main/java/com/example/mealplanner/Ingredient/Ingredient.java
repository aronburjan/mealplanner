package com.example.mealplanner.Ingredient;

import com.example.mealplanner.Nutrient.Nutrient;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.HashMap;
import java.util.UUID;

@Entity
public class Ingredient {
    private @Id @GeneratedValue UUID id;
    private String ingredientName;

    private HashMap<Nutrient, Integer> nutrientContent; //per 100g
    private enum unit{
        milliliter,
        centiliter,
        deciliter,
        liter,
        milligram,
        gram,
        kilogram
    }
}
