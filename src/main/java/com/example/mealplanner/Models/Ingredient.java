package com.example.mealplanner.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Ingredient {

    private @Id @GeneratedValue UUID id;

    private String ingredientName;

    @OneToMany(mappedBy = "ingredient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Nutrient> nutrientContent=new ArrayList<>();

    private int quantity; //should be nullable, only when a recipe exists will quantity be relevant
    @Enumerated(EnumType.STRING)
    private IngredientUnit unit;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="recipe_id")
    private Recipe recipe;
    public Ingredient(){}

    public Ingredient(UUID id, String ingredientName, int quantity, IngredientUnit unit) {
        this.id = id;
        this.ingredientName = ingredientName;
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", ingredientName='" + ingredientName + '\'' +
                ", nutrientContent=" + nutrientContent +
                ", Unit=" + unit +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public List<Nutrient> getNutrientContent() {
        return nutrientContent;
    }

    public IngredientUnit getUnit() {
        return unit;
    }

    public void setUnit(IngredientUnit unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }
}
