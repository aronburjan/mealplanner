package com.example.mealplanner.Nutrient.Repositories;

import com.example.mealplanner.Models.Nutrient;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface NutrientRepository extends CrudRepository<Nutrient, UUID> {
}
