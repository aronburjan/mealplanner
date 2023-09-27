package com.example.mealplanner.Models.User;

import com.example.mealplanner.Models.Ingredient.IngredientLimit;
import com.example.mealplanner.Models.Nutrient.NutrientLimit;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
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

    @OneToMany(mappedBy = "appUserDetails", cascade = CascadeType.ALL)
    private List<NutrientLimit> nutrientLimits = new ArrayList<>();
    @OneToMany(mappedBy = "appUserDetails", cascade = CascadeType.ALL)
    private List<IngredientLimit> ingredientLimits = new ArrayList<>();

    public AppUserDetails(){}

    public AppUserDetails(int age, int height, int weight, Sex sex, WeightGoal goal) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.goal = goal;
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

    public List<NutrientLimit> getNutrientLimits() {
        return nutrientLimits;
    }

    public List<IngredientLimit> getIngredientLimits() {
        return ingredientLimits;
    }


}
