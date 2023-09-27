package com.example.mealplanner.Models.Recipe;

import com.example.mealplanner.Models.Ingredient.Ingredient;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Entity
public class Recipe {
    private @Id @GeneratedValue UUID id;

    private String recipeName;

    @Enumerated(EnumType.STRING)
    private RecipeType recipeType;
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ingredient> recipeIngredients;


    public Recipe(){}



    public Recipe(String recipeName, List<Ingredient> recipeIngredients) {
        this.recipeName = recipeName;
        this.recipeIngredients = new ArrayList<>();
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

    public List<Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public RecipeType getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(RecipeType recipeType) {
        this.recipeType = recipeType;
    }
}
