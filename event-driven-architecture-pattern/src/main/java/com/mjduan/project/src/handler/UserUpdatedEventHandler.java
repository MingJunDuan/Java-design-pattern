package com.mjduan.project.src.handler;

import com.mjduan.project.src.event.UserUpdateEvent;
import com.mjduan.project.src.framework.IHandler;

/**
 * Hans 2017-07-03 18:44
 */
public class UserUpdatedEventHandler implements IHandler<UserUpdateEvent> {
    @Override
    public void onEvent(UserUpdateEvent event) {
        System.out.println("User '"+event.getUser().getUsername()+"' has been updated!");
    }
}
