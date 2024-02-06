package com.example.rw.service.dto_converter.interfaces;

import com.example.rw.model.dto.user.UserRequestTo;
import com.example.rw.model.dto.user.UserResponseTo;
import com.example.rw.model.entity.implementations.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserToConverter extends ToConverter<User, UserRequestTo, UserResponseTo> {
}
