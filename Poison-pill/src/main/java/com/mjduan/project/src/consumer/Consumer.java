package com.mjduan.project.src.consumer;

import com.mjduan.project.src.message.IMessage;

/**
 * Hans 2017-07-15 01:03
 */
public class Consumer {
    private final IMqSubscribePoint queue;
    private final String name;

    public Consumer(IMqSubscribePoint queue, String name) {
        this.queue = queue;
        this.name = name;
    }

    public void consume(){
        while (true) {
            IMessage message;
            try {
                message = queue.take();
                if (IMessage.POISON_PILL.equals(message)){
                    System.out.println("Consumer "+name+" receive request to terminate");
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
            String sender = message.getHeader(IMessage.Headers.SENDER);
            String body = message.getBody();
            System.out.println(name+" reveive "+body+" from sender "+sender);
        }
    }
}
