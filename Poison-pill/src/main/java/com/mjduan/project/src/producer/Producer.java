package com.mjduan.project.src.producer;

import java.util.Date;

import com.mjduan.project.src.message.IMessage;
import com.mjduan.project.src.message.SimpleMessage;

/**
 * Hans 2017-07-15 00:55
 */
public class Producer {
    private final IMqPublishPoint queue;
    private final String name;
    private boolean isStopped;

    public Producer(IMqPublishPoint queue, String name) {
        this.queue = queue;
        this.name = name;
        isStopped = false;
    }

    public void send(String body){
        if (isStopped){
            throw new IllegalStateException(String.format(
                    "Producer %s was stopped and fail to deliver requested message [%s].", body, name));
        }
        IMessage message = new SimpleMessage();
        message.addHeader(IMessage.Headers.DATE,new Date().toString());
        message.addHeader(IMessage.Headers.SENDER,name);
        message.setBody(body);

        try {
            queue.put(message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stop(){
        isStopped = true;
        try {
            queue.put(IMessage.POISON_PILL);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
