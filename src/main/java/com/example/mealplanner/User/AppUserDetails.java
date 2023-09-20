package com.example.mealplanner.User;

import com.example.mealplanner.Ingredient.Ingredient;
import com.example.mealplanner.Nutrient.Nutrient;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.HashMap;
import java.util.UUID;

@Entity
public class AppUserDetails {
    private @Id @GeneratedValue UUID id;
    /*
    private int age;
    private int height;
    private int weight;

    private enum Sex{
        female,
        male
    }
    private enum Goal{
        lose,
        maintain,
        gain
    }

    private Sex sex;
    private Goal goal;

    private HashMap<Nutrient, Integer> nutrientLimits;
    private HashMap<Ingredient, Integer> ingredientLimits;

    public AppUserDetails(){}

    public AppUserDetails(int age, int height, int weight, Sex sex, Goal goal, HashMap<Nutrient, Integer> nutrientLimits, HashMap<Ingredient, Integer> ingredientLimits) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.goal = goal;
        this.nutrientLimits = nutrientLimits;
        this.ingredientLimits = ingredientLimits;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", sex=" + sex +
                ", goal=" + goal +
                ", nutrientLimits=" + nutrientLimits +
                ", ingredientLimits=" + ingredientLimits +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Sex getSex() {
        return sex;
    }

    public Goal getGoal() {
        return goal;
    }

    public HashMap<Nutrient, Integer> getNutrientLimits() {
        return nutrientLimits;
    }

    public HashMap<Ingredient, Integer> getIngredientLimits() {
        return ingredientLimits;
    }

     */
}
