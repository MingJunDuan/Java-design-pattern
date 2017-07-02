package com.mjduan.project.test;

import org.junit.Test;

import com.mjduan.project.src.ICallback;
import com.mjduan.project.src.SimpleTask;
import com.mjduan.project.src.Task;

/**
 * Hans 2017-07-02 19:40
 */
public class App {

    @Test
    public void test(){
        Task task = new SimpleTask();
        ICallback callback = ()->System.out.println("Callback: I'm done now");
        task.executeWith(callback);
    }

}
