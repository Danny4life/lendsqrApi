package com.osiki.lendsqrapi.controller;

import com.osiki.lendsqrapi.model.UserDetails;
import com.osiki.lendsqrapi.service.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class UserDetailsController {

    private UserDetailsService userDetailsService;

    public UserDetailsController(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @PostMapping("/userDetails")
    public UserDetails createUserDetails(@RequestBody UserDetails userDetails){
        return userDetailsService.createUserDetails(userDetails);
    }
}
