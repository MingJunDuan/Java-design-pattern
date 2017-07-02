package com.mjduan.project.src.domain;

import java.util.Objects;

/**
 * Hans 2017-07-02 19:55
 */
public class User {
    private String firstName;
    private String lastName;
    private boolean isActive;
    private String userId;

    public User(String firstName, String lastName, boolean isActive, String userId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
        this.userId = userId;
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

    public String getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return isActive == user.isActive
                && Objects.equals(firstName,user.getFirstName())
                && Objects.equals(lastName,user.getLastName())
                && Objects.equals(userId,user.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName,isActive,userId);
    }

    @Override
    public String toString() {
        return "User{firstName='"+firstName+"',lastName='"+lastName+"',isActive='"
                + isActive+"',userId='"+userId+"'}";
    }
}
