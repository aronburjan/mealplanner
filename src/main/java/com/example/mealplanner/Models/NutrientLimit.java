package com.example.mealplanner.Models;

import com.example.mealplanner.Models.Nutrient;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class NutrientLimit {
    private @Id
    @GeneratedValue UUID id;
    private Nutrient limitedNutrient;
    private int limit;

    public NutrientLimit() {
    }

    public NutrientLimit(Nutrient limitedNutrient, int limit) {
        this.limitedNutrient = limitedNutrient;
        this.limit = limit;
    }

    public Nutrient getLimitedNutrient() {
        return limitedNutrient;
    }

    public void setLimitedNutrient(Nutrient limitedNutrient) {
        this.limitedNutrient = limitedNutrient;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "NutrientLimit{" +
                "limitedNutrient=" + limitedNutrient +
                ", limit=" + limit +
                '}';
    }
}
