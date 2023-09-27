package com.example.mealplanner.User.Services;

import com.example.mealplanner.User.Repositories.AppUserRepository;
import com.example.mealplanner.Models.AppUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AppUserService {
    private final AppUserRepository userRepository;

    public AppUserService(AppUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public AppUser addUser(AppUser user){
        AppUser newUser = user;
        return userRepository.save(newUser);
    }

    public List<AppUser> getUsers(){
        Iterable<AppUser> AppUserIterable = userRepository.findAll();
        List<AppUser> AppUserList = new ArrayList<>();
        for (AppUser usr: AppUserIterable) {
            AppUserList.add(usr);
        }
        return AppUserList;
    }

    public AppUser getUserById(UUID id){
        throw new java.lang.UnsupportedOperationException("Not yet implemented.");
    }

    public void deleteUser(UUID id){
        throw new java.lang.UnsupportedOperationException("Not yet implemented.");
    }

    public AppUser updateUser(UUID id, AppUser u1){
        throw new java.lang.UnsupportedOperationException("Not yet implemented.");
    }
}
