package com.mjduan.project.good_example;

import java.util.List;

/**
 * Hans 2017-09-06 08:44
 */
public class CardDeviceShippingVisitor implements ICardDeviceVisitor {
    private double shippingValue = 0;

    @Override
    public void visit(WirelessPos wirelessPos) {
        System.out.println("Calculating wirelessPos shipping.");
        shippingValue += 15;
    }

    @Override
    public void visit(Mobile mobile) {
        System.out.println("Calculating Mobile shipping");
        shippingValue += 3;
    }

    @Override
    public void visit(WiredPos wiredPos) {
        System.out.println("Calculating WiredPos shipping.");
        shippingValue += 9;
    }

    @Override
    public void visit(CardDeviceOrder cardDeviceOrder) {
        System.out.println("If they bought more than 3 thing, there will be a discount");
        List<ICardDevice> cardDevices = cardDeviceOrder.getCardDevices();
        if (cardDevices.size() > 3) {
            shippingValue -= 5;
        }
        System.out.println("Shipping amount is:" + shippingValue);
    }

    public double getShippingValue() {
        return shippingValue;
    }
}
