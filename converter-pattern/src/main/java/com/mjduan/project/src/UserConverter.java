package com.mjduan.project.src;

import com.mjduan.project.src.domain.User;
import com.mjduan.project.src.domain.UserDto;

/**
 * Hans 2017-07-02 20:10
 */
public class UserConverter extends Converter<UserDto, User> {

    public UserConverter() {
        super(userDto -> new User(userDto.getFirstName(), userDto.getLastName(), userDto.isActive(), userDto.getEmail()),
                user -> new UserDto(user.getFirstName(), user.getLastName(), user.isActive(), user.getUserId()));

    }
}
