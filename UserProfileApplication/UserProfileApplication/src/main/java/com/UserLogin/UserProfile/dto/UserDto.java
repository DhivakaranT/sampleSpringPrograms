package com.UserLogin.UserProfile.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserDto {
    private String name;
    private String emailId;
    private String mobileNumber;
    private BigDecimal height;
    private BigDecimal weight;
    private String address;
}
