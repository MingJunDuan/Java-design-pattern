package com.mjduan.project.src;

/**
 * Hans 2017-07-02 19:35
 */
public abstract class Task {

    public final void executeWith(ICallback callback) {
        execute();
        if (null != callback) {
            callback.call();
        }
    }

    public abstract void execute();

}
