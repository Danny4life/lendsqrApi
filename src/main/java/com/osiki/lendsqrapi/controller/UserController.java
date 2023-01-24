package com.osiki.lendsqrapi.controller;

import com.osiki.lendsqrapi.model.User;
import com.osiki.lendsqrapi.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
