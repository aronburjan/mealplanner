package com.example.mealplanner.Models.Nutrient;

import com.example.mealplanner.Models.Ingredient.Ingredient;
import com.example.mealplanner.Models.Ingredient.IngredientLimit;
import jakarta.persistence.*;

import java.util.UUID;
@Entity
public class Nutrient {

    private @Id @GeneratedValue UUID id;


    private String nutrientName;
    private boolean isMacroNutrient;

    private int quantity; //should be nullable, only when an ingredient exists will quantity be relevant
    @Enumerated(EnumType.STRING)
    private NutrientUnit unit;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ingredient_id")
    private Ingredient ingredient;

    @OneToOne(mappedBy = "limitedNutrient")
    private NutrientLimit nutrientLimit;

    public Nutrient(){}


    public Nutrient(String nutrientName, boolean isMacroNutrient, NutrientUnit unit) {
        this.nutrientName = nutrientName;
        this.isMacroNutrient = isMacroNutrient;
    }

    @Override
    public String toString() {
        return "Nutrient{" +
                "id=" + id +
                ", nutrientName='" + nutrientName + '\'' +
                ", isMacroNutrient=" + isMacroNutrient +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public String getNutrientName() {
        return nutrientName;
    }

    public boolean isMacroNutrient() {
        return isMacroNutrient;
    }

    public NutrientUnit getUnit() {
        return unit;
    }

    public void setUnit(NutrientUnit unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }
}
