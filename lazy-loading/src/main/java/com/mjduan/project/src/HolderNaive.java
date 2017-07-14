package com.mjduan.project.src;

/**
 * Hans 2017-07-15 00:17
 */
public class HolderNaive {
    private Heavy heavy;

    public HolderNaive() {
        System.out.println("HolderNaive created");
    }

    public Heavy getHeavy(){
        if (null == heavy) {
            heavy = new Heavy();
        }
        return heavy;
    }
}
