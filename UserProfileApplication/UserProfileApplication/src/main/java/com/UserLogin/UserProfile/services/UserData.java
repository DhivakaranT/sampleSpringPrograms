package com.UserLogin.UserProfile.services;

import com.UserLogin.UserProfile.dto.UserDto;
import com.UserLogin.UserProfile.entity.UserDetails;
import com.UserLogin.UserProfile.mapper;
import com.UserLogin.UserProfile.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.validation.ValidationException;
import java.time.LocalDateTime;

@Service
public class UserData {
    @Autowired
    private UserProfileRepository userProfileRepository;

    public UserDetails createUserProfile(@Valid UserDto userDataRequest) {
        if (userProfileRepository.existsByEmailId(userDataRequest.getEmailId())) {
            throw new ValidationException("User Already Existing");
        }

        UserDetails userProfile = mapper.INSTANCE.userDtoToUserDetails(userDataRequest);
        return userProfileRepository.save(userProfile);
    }
}
