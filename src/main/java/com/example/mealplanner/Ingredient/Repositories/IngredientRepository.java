package com.example.mealplanner.Ingredient.Repositories;

import com.example.mealplanner.Models.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IngredientRepository extends CrudRepository<Ingredient, UUID> {
}
