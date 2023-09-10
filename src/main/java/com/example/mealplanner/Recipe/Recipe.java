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
    private String recipeName;

    private enum recipeType{
        vegan,
        vegetarian,
        lactose_free,
        gluten_free
    }

    private HashMap<Ingredient, Integer> recipeIngredients;

}
