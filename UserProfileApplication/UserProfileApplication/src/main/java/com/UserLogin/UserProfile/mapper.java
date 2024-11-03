package com.UserLogin.UserProfile;


import com.UserLogin.UserProfile.dto.UserDto;
import com.UserLogin.UserProfile.entity.UserDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface mapper {
    mapper INSTANCE = Mappers.getMapper(mapper.class);
    UserDetails userDtoToUserDetails(UserDto userDto);
}
