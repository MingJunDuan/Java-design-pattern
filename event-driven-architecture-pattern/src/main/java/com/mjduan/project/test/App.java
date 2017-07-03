package com.mjduan.project.test;

import org.junit.Test;

import com.mjduan.project.src.domain.User;
import com.mjduan.project.src.event.UserCreatedEvent;
import com.mjduan.project.src.event.UserUpdateEvent;
import com.mjduan.project.src.framework.EventDispatcher;
import com.mjduan.project.src.handler.UserCreatedEventHandler;
import com.mjduan.project.src.handler.UserUpdatedEventHandler;

/**
 * Hans 2017-07-03 18:46
 */
public class App {

    @Test
    public void test(){
        EventDispatcher eventDispatcher = new EventDispatcher();
        eventDispatcher.registerHandler(UserCreatedEvent.class,new UserCreatedEventHandler());
        eventDispatcher.registerHandler(UserUpdateEvent.class,new UserUpdatedEventHandler());

        User mjduan = new User("mjduan");
        eventDispatcher.dispatch(new UserCreatedEvent(mjduan));
        eventDispatcher.dispatch(new UserUpdateEvent(mjduan));
    }

}
