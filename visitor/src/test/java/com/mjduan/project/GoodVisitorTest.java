package com.mjduan.project;

import org.junit.Test;

import com.mjduan.project.good_example.CardDeviceDisplayVisitor;
import com.mjduan.project.good_example.CardDeviceOrder;
import com.mjduan.project.good_example.CardDeviceShippingVisitor;
import com.mjduan.project.good_example.Mobile;
import com.mjduan.project.good_example.WiredPos;
import com.mjduan.project.good_example.WirelessPos;

/**
 * Hans 2017-09-06 09:02
 */
public class GoodVisitorTest {

    @Test
    public void test1(){
        CardDeviceOrder cardDeviceOrder = new CardDeviceOrder();
        cardDeviceOrder.addPart(new Mobile());
        cardDeviceOrder.addPart(new WiredPos());
        cardDeviceOrder.addPart(new WirelessPos());

        //More flexibility
        CardDeviceShippingVisitor cardDeviceShippingVisitor = new CardDeviceShippingVisitor();
        cardDeviceOrder.accept(cardDeviceShippingVisitor);
        cardDeviceOrder.accept(new CardDeviceDisplayVisitor());
        double shippingValue = cardDeviceShippingVisitor.getShippingValue();
        System.out.println(shippingValue);
    }

}
