package com.osiki.lendsqrapi.controller;

import com.osiki.lendsqrapi.model.UserDetails;
import com.osiki.lendsqrapi.service.UserDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
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

    @GetMapping("/userDetails")

    public List<UserDetails> getUserInformation(){

        return userDetailsService.getUserInformation();

    }

    @GetMapping("/userDetails/{id}")

    public ResponseEntity<UserDetails> getUserInformationById(@PathVariable Long id){

        UserDetails userDetails = null;

        userDetails = userDetailsService.getUserInformationById(id);
        return ResponseEntity.ok(userDetails);

    }
}
