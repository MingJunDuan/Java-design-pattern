package com.mjduan.project.src;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

import com.mjduan.project.src.exception.EventDoesNotExistException;
import com.mjduan.project.src.exception.InvalidOperationException;
import com.mjduan.project.src.exception.LongRunningEventException;
import com.mjduan.project.src.exception.MaxNumberOfEventsAllowedException;

/**
 * Hans 2017-07-03 16:08
 */
public class EventManager implements IThreadCompleteListener {
    public static final int MAX_RUNNING_EVENTS = 1_000;
    public static final int MIN_ID = 1;
    public static final int MAX_ID = MAX_RUNNING_EVENTS;
    public static final int MAX_EVENT_TIME = 1800;
    private int currentlyRunningSyncEvent = -1;
    private Random rand;
    private Map<Integer, Event> eventPool;

    public EventManager() {
        rand = new Random(1);
        eventPool = new ConcurrentHashMap<>(MAX_RUNNING_EVENTS);
    }

    public int create(int eventTime) throws InvalidOperationException, LongRunningEventException, MaxNumberOfEventsAllowedException {
        if (currentlyRunningSyncEvent != -1) {
            throw new InvalidOperationException("Event [" + currentlyRunningSyncEvent + "] is still running, please wait until finishes and try again");
        }

        int eventId = createEvent(eventTime, true);
        currentlyRunningSyncEvent = eventId;
        return eventId;
    }

    public int createAsync(int eventTime) throws LongRunningEventException, MaxNumberOfEventsAllowedException {
        return createEvent(eventTime, false);
    }

    private int createEvent(int eventTime, boolean isSynchronous) throws MaxNumberOfEventsAllowedException, LongRunningEventException {
        if (eventPool.size() == MAX_RUNNING_EVENTS) {
            throw new MaxNumberOfEventsAllowedException("Too many events are running at the moment. Please try again later");
        }
        if (eventTime >= MAX_EVENT_TIME) {
            throw new LongRunningEventException(
                    "Maximum event time allowed is " + MAX_EVENT_TIME + " seconds. Please try again");
        }
        int newEventId = generatedId();
        Event newEvent = new Event(newEventId, eventTime, isSynchronous);
        newEvent.addListener(this);
        eventPool.put(newEventId, newEvent);

        return newEventId;
    }

    @Override
    public void completeEventHandler(int eventId) {

    }

    private int generatedId() {
        int randomNum = rand.nextInt((MAX_ID - MIN_ID) + 1) + MIN_ID;
        while (eventPool.containsKey(randomNum)) {
            randomNum = rand.nextInt((MAX_ID - MIN_ID) + 1) + MIN_ID;
        }
        return randomNum;
    }

    public void start(int eventId) throws EventDoesNotExistException {
        if (!eventPool.containsKey(eventId)) {
            throw new EventDoesNotExistException(eventId + " does not exist.");
        }
        eventPool.get(eventId).start();
    }

    public void cancel(int eventId) throws EventDoesNotExistException {
        if (!eventPool.containsKey(eventId)) {
            throw new EventDoesNotExistException(eventId + " does not exist.");
        }
        if (eventId == currentlyRunningSyncEvent) {
            currentlyRunningSyncEvent = -1;
        }
        eventPool.get(eventId).stop();
        eventPool.remove(eventId);
    }

    public void status(int eventId) throws EventDoesNotExistException {
        if (!eventPool.containsKey(eventId)) {
            throw new EventDoesNotExistException(eventId+" does not exist.");
        }
        eventPool.get(eventId).status();
    }

    public void statusOfAllEvents() {
        Iterator<Map.Entry<Integer, Event>> iterator = eventPool.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Event> entry = iterator.next();
            entry.getValue().status();
        }
    }

    public void shutdown() {
        Iterator<Map.Entry<Integer, Event>> iterator = eventPool.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Event> entry = iterator.next();
            entry.getValue().stop();
        }
    }

}
