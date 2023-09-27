package com.example.mealplanner.Repositories;

import com.example.mealplanner.Models.Nutrient.Nutrient;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface NutrientRepository extends CrudRepository<Nutrient, UUID> {
}
