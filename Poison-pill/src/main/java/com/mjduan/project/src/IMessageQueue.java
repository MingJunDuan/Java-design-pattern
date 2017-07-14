package com.mjduan.project.src;

import com.mjduan.project.src.consumer.IMqSubscribePoint;
import com.mjduan.project.src.producer.IMqPublishPoint;

/**
 * Hans 2017-07-15 01:08
 */
public interface IMessageQueue extends IMqPublishPoint,IMqSubscribePoint {
}
