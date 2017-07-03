package com.mjduan.project.src.framework;

/**
 * Hans 2017-07-03 18:36
 */
public interface IHandler<E extends IEvent> {

    void onEvent(E event);

}
