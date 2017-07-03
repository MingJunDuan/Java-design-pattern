package com.mjduan.project.src.event;

import com.mjduan.project.src.framework.IEvent;

/**
 * Hans 2017-07-03 18:32
 */
public class AbstractEvent implements IEvent {
    @Override
    public Class<? extends IEvent> getType() {
        return getClass();
    }
}
