package com.mjduan.project.src;

/**
 * Hans 2017-07-15 00:18
 */
public class HolderThreadSafe {
    private Heavy heavy;

    public HolderThreadSafe() {
        System.out.println(this.getClass().getSimpleName()+" created");
    }

    public synchronized Heavy getHeavy(){
        if (null==heavy){
            heavy = new Heavy();
        }
        return heavy;
    }
}
