package com.example.mealplanner.Nutrient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;
@Entity
public class Nutrient {

    private @Id @GeneratedValue UUID id;
    /*
    private String nutrientName;
    private boolean isMacroNutrient;
    private enum unit{
        microgram,
        milligram,
        gram

    }

    public Nutrient(){}

    public Nutrient(String nutrientName, boolean isMacroNutrient) {
        this.nutrientName = nutrientName;
        this.isMacroNutrient = isMacroNutrient;
    }

    @Override
    public String toString() {
        return "Nutrient{" +
                "id=" + id +
                ", nutrientName='" + nutrientName + '\'' +
                ", isMacroNutrient=" + isMacroNutrient +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public String getNutrientName() {
        return nutrientName;
    }

    public boolean isMacroNutrient() {
        return isMacroNutrient;
    }*/
}
