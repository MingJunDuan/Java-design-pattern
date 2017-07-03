package com.mjduan.project.src;

/**
 * Hans 2017-07-03 16:01
 */
public class Event implements IEvent,Runnable {
    private int eventId;
    private int eventTime;
    private boolean isSynchronous;
    private Thread thread;
    private boolean isComplete;
    private IThreadCompleteListener eventListener;

    public Event(int eventId, int eventTime, boolean isSynchronous) {
        this.eventId = eventId;
        this.eventTime = eventTime;
        this.isSynchronous = isSynchronous;
    }

    /**
     * @return isSynchronous
     */
    public boolean isSynchronous() {
        return isSynchronous;
    }

    @Override
    public void start() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void stop() {
        if (null == thread) {
            return;
        }
        thread.interrupt();
    }

    @Override
    public void status() {
        if (!isComplete) {
            System.out.println(eventId + " is not done");
        } else {
            System.out.println(eventId+" is done");
        }
    }

    @Override
    public void run() {
        long currentTime = System.currentTimeMillis();
        long endTime = currentTime+(eventTime*10);
        while (System.currentTimeMillis() < endTime) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isComplete = true;
        completed();
    }

    public final void addListener(final IThreadCompleteListener listener) {
        eventListener = listener;
    }

    public final void removeListener(final IThreadCompleteListener listener) {
        eventListener = null;
    }

    private final void completed() {
        if (null != eventListener) {
            eventListener.completeEventHandler(eventId);
        }
    }
}
