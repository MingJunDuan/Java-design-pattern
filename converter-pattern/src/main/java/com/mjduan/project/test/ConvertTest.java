package com.mjduan.project.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.mjduan.project.src.UserConverter;
import com.mjduan.project.src.domain.UserDto;

/**
 * Hans 2017-07-02 20:25
 */
public class ConvertTest {
    private UserConverter userConverter = new UserConverter();

    @Test
    public void test_() {
        UserDto userDto1 = new UserDto("Tom", "Hanks", true, "123@.com");
        UserDto userDto2 = userConverter.convertFromEntity(userConverter.convertFromDto(userDto1));

        assertEquals(userDto1, userDto2);
    }
}
