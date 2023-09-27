package com.example.mealplanner.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.UUID;

@Entity
public class AppUserDetails {
    private @Id @GeneratedValue UUID id;

    private int age;
    private int height;
    private int weight;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    @Enumerated(EnumType.STRING)
    private WeightGoal goal;

    @OneToMany
    private ArrayList<NutrientLimit> nutrientLimits;
    @OneToMany
    private ArrayList<IngredientLimit> ingredientLimits;

    public AppUserDetails(){}

    public AppUserDetails(int age, int height, int weight, Sex sex, WeightGoal goal, ArrayList<NutrientLimit> nutrientLimits, ArrayList<IngredientLimit> ingredientLimits) {
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

    public WeightGoal getGoal() {
        return goal;
    }

    public ArrayList<NutrientLimit> getNutrientLimits() {
        return nutrientLimits;
    }

    public ArrayList<IngredientLimit> getIngredientLimits() {
        return ingredientLimits;
    }


}
