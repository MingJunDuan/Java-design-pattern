package com.mjduan.project.src;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.mjduan.project.src.message.IMessage;

/**
 * Hans 2017-07-15 01:09
 */
public class SimpleMessageQueue implements IMessageQueue {
    private final BlockingQueue<IMessage> queue;

    public SimpleMessageQueue(int bound) {
        queue = new ArrayBlockingQueue<>(bound);
    }

    @Override
    public void put(IMessage message) throws InterruptedException {
        queue.put(message);
    }

    @Override
    public IMessage take() throws InterruptedException {
        return queue.take();
    }
}
