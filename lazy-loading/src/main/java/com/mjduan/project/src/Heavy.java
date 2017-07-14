package com.mjduan.project.src;

/**
 * Hans 2017-07-15 00:15
 */
public class Heavy {

    public Heavy() {
        System.out.println("Creating heavy...");
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Heavy created...");
    }
}
