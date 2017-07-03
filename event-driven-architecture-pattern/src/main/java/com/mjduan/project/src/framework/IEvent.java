package com.mjduan.project.src.framework;

/**
 * Hans 2017-07-03 18:31
 */
public interface IEvent {

    Class<? extends IEvent> getType();

}
