package com.mjduan.project.test;

import java.util.function.Supplier;

import org.junit.Test;

import com.mjduan.project.src.Heavy;
import com.mjduan.project.src.HolderNaive;
import com.mjduan.project.src.HolderThreadSafe;
import com.mjduan.project.src.Java8Holder;

/**
 * Hans 2017-07-15 00:26
 */
public class App {

    @Test
    public void test(){
        HolderNaive holderNaive = new HolderNaive();
        Heavy heavy = holderNaive.getHeavy();
        System.out.println("heavy ="+heavy);

        HolderThreadSafe holderThreadSafe = new HolderThreadSafe();
        Heavy heavy1 = holderThreadSafe.getHeavy();

        Java8Holder java8Holder = new Java8Holder();
        Supplier<Heavy> heavy2 = java8Holder.getHeavy();
    }

}
