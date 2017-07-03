package com.mjduan.project.src.event;

import com.mjduan.project.src.domain.User;

/**
 * Hans 2017-07-03 18:33
 */
public class UserCreatedEvent extends AbstractEvent  {
    private User user;

    public UserCreatedEvent(User user) {
        this.user = user;
    }

    /**
     * @return user
     */
    public User getUser() {
        return user;
    }
}
