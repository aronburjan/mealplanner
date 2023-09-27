package com.example.mealplanner.Models.Nutrient;

import com.example.mealplanner.Models.User.AppUserDetails;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class NutrientLimit {
    private @Id
    @GeneratedValue UUID id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nutrient_id")
    private Nutrient limitedNutrient;
    private int limitedTo;

    public NutrientLimit() {
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userdetail_id")
    private AppUserDetails appUserDetails;

    public NutrientLimit(Nutrient limitedNutrient, int limit) {
        this.limitedNutrient = limitedNutrient;
        this.limitedTo = limit;
    }

    public Nutrient getLimitedNutrient() {
        return limitedNutrient;
    }

    public void setLimitedNutrient(Nutrient limitedNutrient) {
        this.limitedNutrient = limitedNutrient;
    }

    public int getLimitedTo() {
        return limitedTo;
    }

    public void setLimitedTo(int limitedTo) {
        this.limitedTo = limitedTo;
    }

    @Override
    public String toString() {
        return "NutrientLimit{" +
                "limitedNutrient=" + limitedNutrient +
                ", limit=" + limitedTo +
                '}';
    }


}
