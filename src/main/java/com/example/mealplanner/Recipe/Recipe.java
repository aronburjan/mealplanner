package com.example.mealplanner.Recipe;

import com.example.mealplanner.Ingredient.Ingredient;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.HashMap;
import java.util.UUID;
@Entity
public class Recipe {
    private @Id @GeneratedValue UUID id;
    /*
    private String recipeName;

    private enum recipeType{
        vegan,
        vegetarian,
        lactose_free,
        gluten_free
    }

    private HashMap<Ingredient, Integer> recipeIngredients;

    public Recipe(){}

    public Recipe(String recipeName, HashMap<Ingredient, Integer> recipeIngredients) {
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredients;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", recipeName='" + recipeName + '\'' +
                ", recipeIngredients=" + recipeIngredients +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public HashMap<Ingredient, Integer> getRecipeIngredients() {
        return recipeIngredients;
    }*/
}
