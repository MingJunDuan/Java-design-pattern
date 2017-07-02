package com.mjduan.project.src;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Hans 2017-06-30 20:36
 */
public class App {

    public static void main(String[] args){
        final WashingMachine washingMachine = new WashingMachine();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i=0;i<3;i++) {
            executorService.execute(()->washingMachine.wash());
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
