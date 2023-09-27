package com.example.mealplanner.User.Controllers;

import com.example.mealplanner.Models.AppUser;
import com.example.mealplanner.User.Services.AppUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppUserController {
    AppUserService appUserService;

    AppUserController(AppUserService appUserService){
        this.appUserService = appUserService;
    }

    @PostMapping("/users")
    AppUser newUser(@RequestBody AppUser user){
        return appUserService.addUser(user);
    }
    @GetMapping("/users")
    List<AppUser> getStudents() {
        return appUserService.getUsers();
    }

}
