package com.osiki.lendsqrapi.controller;

import com.osiki.lendsqrapi.model.User;
import com.osiki.lendsqrapi.service.UserService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }


}
