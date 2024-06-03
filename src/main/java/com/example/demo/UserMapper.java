package com.example.demo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface UserMapper {
    UserDTO userToUserDTO(User user);
    User userDTOToUser(UserDTO userDTO);

    @Mapping(target = "id", ignore = true)
    UserDTO createUserDTOWithoutId(User user);
}
