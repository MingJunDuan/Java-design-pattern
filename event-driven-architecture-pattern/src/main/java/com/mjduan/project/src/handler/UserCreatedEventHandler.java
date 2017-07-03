package com.mjduan.project.src.handler;

import com.mjduan.project.src.event.UserCreatedEvent;
import com.mjduan.project.src.framework.IHandler;

/**
 * Hans 2017-07-03 18:43
 */
public class UserCreatedEventHandler implements IHandler<UserCreatedEvent> {
    @Override
    public void onEvent(UserCreatedEvent event) {
        System.out.println("User '"+event.getUser().getUsername()+"' has been created");
    }
}
