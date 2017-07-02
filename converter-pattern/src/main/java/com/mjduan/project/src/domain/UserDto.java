package com.mjduan.project.src.domain;

import java.util.Objects;

/**
 * Hans 2017-07-02 20:01
 */
public class UserDto {
    private String firstName;
    private String lastName;
    private boolean isActive;
    private String email;

    public UserDto(String firstName, String lastName, boolean isActive, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserDto userDto = (UserDto) obj;
        return isActive==userDto.isActive
                && Objects.equals(firstName,userDto.getFirstName())
                && Objects.equals(lastName,userDto.getLastName())
                && Objects.equals(email,userDto.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName,isActive,email);
    }

    @Override
    public String toString() {
        return  "UserDto{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
                + ", isActive=" + isActive + ", email='" + email + '\'' + '}';
    }
}
