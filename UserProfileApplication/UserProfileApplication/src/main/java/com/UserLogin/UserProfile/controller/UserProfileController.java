package com.UserLogin.UserProfile.controller;

import com.UserLogin.UserProfile.dto.UserDto;
import com.UserLogin.UserProfile.entity.UserDetails;
import com.UserLogin.UserProfile.repository.UserProfileRepository;
import com.UserLogin.UserProfile.services.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.ValidationException;

@RestController
@RequestMapping("/userProfiles")
public class UserProfileController {
    @Autowired
    private UserData userData;

    @PostMapping
    public ResponseEntity<String> createUserProfile(@Valid @RequestBody UserDto userDto) {
        try {
            UserDetails userDetails = userData.createUserProfile(userDto);
            return new ResponseEntity<>("User profile created successfully", HttpStatus.CREATED);
        } catch (ValidationException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
