package com.mjduan.project.test;

import org.junit.Test;

import com.mjduan.project.src.IMessageQueue;
import com.mjduan.project.src.SimpleMessageQueue;
import com.mjduan.project.src.consumer.Consumer;
import com.mjduan.project.src.producer.Producer;

/**
 * Hans 2017-07-15 01:15
 */
public class App {

    public static void main(String[] args){
        IMessageQueue queue = new SimpleMessageQueue(10_000);
        final Producer producer = new Producer(queue,"Producer1");
        final Consumer consumer = new Consumer(queue,"Consumer1");

        new Thread(){
            @Override
            public void run() {
                consumer.consume();
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                producer.send("hand shake");
                producer.send("Some very important information");
                producer.send("bye!");
                producer.stop();
            }
        }.start();
    }

}
