package com.UserLogin.UserProfile.repository;

import com.UserLogin.UserProfile.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserDetails,Long>{
    boolean existsByEmailId(String emailId);
}
