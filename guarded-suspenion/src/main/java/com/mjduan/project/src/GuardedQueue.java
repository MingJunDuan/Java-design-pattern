package com.mjduan.project.src;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Hans 2017-07-14 23:57
 */
public class GuardedQueue {
    private final Queue<Integer> sourceList;

    public GuardedQueue() {
        this.sourceList = new LinkedList<>();
    }

    public synchronized Integer get(){
        while (sourceList.isEmpty()){
            try {
                System.out.println("waiting");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("getting");
        return sourceList.peek();
    }

    public synchronized void put(Integer e){
        System.out.println("putting element");
        sourceList.add(e);
        System.out.println("notifying the waiter");
        notify();
    }
}
