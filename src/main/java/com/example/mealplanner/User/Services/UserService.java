package com.example.mealplanner.User.Services;

import com.example.mealplanner.User.Repositories.UserRepository;
import com.example.mealplanner.User.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User addUser(User u1){
        throw new java.lang.UnsupportedOperationException("Not yet implemented.");
    }

    public List<User> getUsers(){
        throw new java.lang.UnsupportedOperationException("Not yet implemented.");
    }

    public User getUserById(UUID id){
        throw new java.lang.UnsupportedOperationException("Not yet implemented.");
    }

    public void deleteUser(UUID id){
        throw new java.lang.UnsupportedOperationException("Not yet implemented.");
    }

    public User updateUser(UUID id, User u1){
        throw new java.lang.UnsupportedOperationException("Not yet implemented.");
    }
}
