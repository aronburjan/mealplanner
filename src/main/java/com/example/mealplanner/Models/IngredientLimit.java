package com.example.mealplanner.Models;

import com.example.mealplanner.Models.Ingredient;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class IngredientLimit {
    private @Id
    @GeneratedValue UUID id;
    private Ingredient limitedIngredient;
    private int limit;

    public IngredientLimit(){}
    public IngredientLimit(Ingredient limitedIngredient, int limit) {
        this.limitedIngredient = limitedIngredient;
        this.limit = limit;
    }

    public Ingredient getLimitedIngredient() {
        return limitedIngredient;
    }

    public void setLimitedIngredient(Ingredient limitedIngredient) {
        this.limitedIngredient = limitedIngredient;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "IngredientLimit{" +
                "limitedIngredient=" + limitedIngredient +
                ", limit=" + limit +
                '}';
    }
}
