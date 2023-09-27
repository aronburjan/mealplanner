package com.example.mealplanner.Models.Ingredient;

import com.example.mealplanner.Models.User.AppUserDetails;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class IngredientLimit {
    private @Id
    @GeneratedValue UUID id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ingredient_id")
    private Ingredient limitedIngredient;
    private int limitedTo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userdetail_id")
    private AppUserDetails appUserDetails;

    public IngredientLimit(){}
    public IngredientLimit(Ingredient limitedIngredient, int limitedTo) {
        this.limitedIngredient = limitedIngredient;
        this.limitedTo = limitedTo;
    }

    public Ingredient getLimitedIngredient() {
        return limitedIngredient;
    }

    public void setLimitedIngredient(Ingredient limitedIngredient) {
        this.limitedIngredient = limitedIngredient;
    }

    public int getLimitedTo() {
        return limitedTo;
    }

    public void setLimitedTo(int limitedTo) {
        this.limitedTo = limitedTo;
    }

    @Override
    public String toString() {
        return "IngredientLimit{" +
                "limitedIngredient=" + limitedIngredient +
                ", limit=" + limitedTo +
                '}';
    }


}
