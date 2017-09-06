package com.mjduan.project;

import org.junit.Test;

import com.mjduan.project.bad_example.CardDeviceOrder;
import com.mjduan.project.bad_example.Mobile;
import com.mjduan.project.bad_example.WiredPos;
import com.mjduan.project.bad_example.WirelessPos;

/**
 * Hans 2017-09-06 09:48
 */
public class BadDesignTest {

    @Test
    public void test(){
        //耦合度高，highly coupled
        CardDeviceOrder cardDeviceOrder = new CardDeviceOrder();
        cardDeviceOrder.addPart(new Mobile());
        cardDeviceOrder.addPart(new WiredPos());
        cardDeviceOrder.addPart(new WirelessPos());

        double shippingCost = cardDeviceOrder.calculateShipping();
        System.out.println(shippingCost);
    }

}
