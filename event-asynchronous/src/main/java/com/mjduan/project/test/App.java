package com.mjduan.project.test;

import com.mjduan.project.src.EventManager;
import com.mjduan.project.src.exception.EventDoesNotExistException;
import com.mjduan.project.src.exception.InvalidOperationException;
import com.mjduan.project.src.exception.LongRunningEventException;
import com.mjduan.project.src.exception.MaxNumberOfEventsAllowedException;

/**
 * Hans 2017-07-03 16:56
 */
public class App {

    public static void main(String[] args) throws LongRunningEventException, MaxNumberOfEventsAllowedException, InvalidOperationException, EventDoesNotExistException {
        App app = new App();
        app.quickRun();
    }

    private void quickRun() throws LongRunningEventException, MaxNumberOfEventsAllowedException, EventDoesNotExistException, InvalidOperationException {
        EventManager eventManager = new EventManager();
        int aEventId = eventManager.createAsync(60);
        System.out.println("Async event ["+aEventId+"] has been created");
        eventManager.start(aEventId);
        System.out.println("Async event ["+aEventId+"] has been started");

        int sEventId = eventManager.create(60);
        System.out.println("Sync event ["+sEventId+"] has been created");
        eventManager.start(sEventId);
        System.out.println("Sync event ["+sEventId+"] has been started");

        eventManager.start(aEventId);
        eventManager.start(sEventId);

        eventManager.cancel(aEventId);
        System.out.println("Async event ["+aEventId+"] has been stopped");
        eventManager.cancel(sEventId);
        System.out.println("Sync event ["+sEventId+"] has been stopped");
    }
}
