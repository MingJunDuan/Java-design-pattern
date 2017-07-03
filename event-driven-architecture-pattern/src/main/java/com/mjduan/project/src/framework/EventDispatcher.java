package com.mjduan.project.src.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * Hans 2017-07-03 18:38
 */
public class EventDispatcher {
    private Map<Class<? extends IEvent>, IHandler<? extends IEvent>> handlers;

    public EventDispatcher() {
        handlers = new HashMap<>();
    }

    public <E extends IEvent> void registerHandler(Class<E> eventType, IHandler<E> handler) {
        handlers.put(eventType, handler);
    }

    public <E extends IEvent> void dispatch(E event) {
        IHandler<E> handler = (IHandler<E>) handlers.get(event.getClass());
        if (null != handler) {
            handler.onEvent(event);
        }
    }

}
