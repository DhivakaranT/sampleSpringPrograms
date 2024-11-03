package com.UserLogin.UserProfile.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;


import java.sql.Timestamp;
import java.time.LocalDateTime;
//import javax.validation.constraints.Email;

@Entity
@Table(name="user_profiles")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true,nullable = false)
    //@Email
    private String emailId;

    @Column(unique = true,nullable = false)
    @Pattern(regexp ="^\\d{10}$")
    private String mobileNumber;

    @Column(nullable = false)
    private Double height;

    @Column(nullable = false)
    private Double weight;

    @Column(length = 500)
    @Size(max=500)
    private String address;

    //@Column(nullable = false)
    //private LocalDateTime createdDateTime=LocalDateTime.now();

    //@Column(nullable = false)
    //private LocalDateTime updatedDateTime=LocalDateTime.now();

    @CreatedDate
    @Column(name="Created On")
    private Timestamp createdOn;
}


