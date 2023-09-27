package com.example.mealplanner.Repositories;

import com.example.mealplanner.Models.Ingredient.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IngredientRepository extends CrudRepository<Ingredient, UUID> {
}
