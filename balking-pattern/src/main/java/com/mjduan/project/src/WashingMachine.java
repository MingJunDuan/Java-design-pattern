package com.mjduan.project.src;

import java.util.logging.Logger;

/**
 * Hans 2017-06-30 20:26
 */
public class WashingMachine {
    private Logger LOG = Logger.getLogger(getClass().getName());

    private WashingMachineState washingMachineState;

    public WashingMachine() {
        this.washingMachineState = WashingMachineState.ENABLED;
    }

    public WashingMachineState getWashingMachineState() {
        return washingMachineState;
    }

    public void wash() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName()+" require machine and machine state is :"+getWashingMachineState());
            if (washingMachineState == WashingMachineState.WASHING) {
                System.err.println(Thread.currentThread().getName()+" can't wash because the machine has been washing!");
                return;
            }
            washingMachineState = WashingMachineState.WASHING;

        }
        System.out.println(Thread.currentThread().getName()+" doing the washing");

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        endOfWashing();

    }

    public synchronized void endOfWashing() {
        washingMachineState = WashingMachineState.ENABLED;
        System.out.println(Thread.currentThread().getName()+" washing complete");
    }

}
