package com.mjduan.project.src.producer;

import com.mjduan.project.src.message.IMessage;

/**
 * Hans 2017-07-15 00:46
 */
public interface IMqPublishPoint {

    void put(IMessage message) throws InterruptedException;

}
