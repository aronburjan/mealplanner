package com.example.mealplanner.Repositories;

import com.example.mealplanner.Models.Recipe.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface RecipeRepository extends CrudRepository<Recipe, UUID> {
}
