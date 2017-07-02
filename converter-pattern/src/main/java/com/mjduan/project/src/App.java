package com.mjduan.project.src;

import java.util.Arrays;
import java.util.List;

import com.mjduan.project.src.domain.User;
import com.mjduan.project.src.domain.UserDto;

/**
 * Hans 2017-07-02 20:16
 */
public class App {

    public static void main(String[] args){
        Converter<UserDto, User> userDtoUserConverter = new Converter<>(
                userDto -> new User(userDto.getFirstName(), userDto.getLastName(), userDto.isActive(), userDto.getEmail()),
                user -> new UserDto(user.getFirstName(), user.getLastName(), user.isActive(), user.getUserId()));

        UserDto userDto = new UserDto("John", "Doe", true, "123@email.com");
        User user = userDtoUserConverter.convertFromDto(userDto);
        System.out.println(user.toString());

        List<User> users = Arrays.asList(new User("Camile", "Tough", false, "124@.com"),
                new User("Marti", "Luther", true, "125@.com"),
                new User("Kate", "Smith", true, "126@.com"));
        List<UserDto> userDtos = userDtoUserConverter.createFromEntities(users);
        userDtos.forEach(System.out::println);
    }

}
