package com.mjduan.project.src.consumer;

import com.mjduan.project.src.message.IMessage;

/**
 * Hans 2017-07-15 00:54
 */
public interface IMqSubscribePoint {

    IMessage take() throws InterruptedException;

}
