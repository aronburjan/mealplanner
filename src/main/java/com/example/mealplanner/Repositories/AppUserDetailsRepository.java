package com.example.mealplanner.Repositories;

import com.example.mealplanner.Models.User.AppUserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AppUserDetailsRepository extends CrudRepository<AppUserDetails, UUID> {
}
