package com.example.mealplanner.Recipe.Repositories;

import com.example.mealplanner.Models.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface RecipeRepository extends CrudRepository<Recipe, UUID> {
}
