package com.example.mealplanner.Nutrient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;
@Entity
public class Nutrient {
    private @Id @GeneratedValue UUID id;

    private String nutrientName;
    private boolean isMacroNutrient;
    private enum unit{
        microgram,
        milligram,
        gram

    }

}
