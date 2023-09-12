package com.example.mealplanner.User.Repositories;

import com.example.mealplanner.User.UserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, UUID> {
}
