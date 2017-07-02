package com.mjduan.project.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.mjduan.project.src.ICallback;
import com.mjduan.project.src.SimpleTask;
import com.mjduan.project.src.Task;

/**
 * Hans 2017-07-02 19:43
 */
public class CallbackTest {
    private Integer callingCount = 0;

    @Test
    public void test() {
        ICallback callback = () -> callingCount++;
        Task task = new SimpleTask();

        assertEquals(new Integer(0), callingCount);

        task.executeWith(callback);
        assertEquals(new Integer(1), callingCount);

        task.executeWith(callback);
        assertEquals(new Integer(2), callingCount);
    }

}
