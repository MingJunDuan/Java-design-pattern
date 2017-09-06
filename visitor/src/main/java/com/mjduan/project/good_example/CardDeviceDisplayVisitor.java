package com.mjduan.project.good_example;

/**
 * Hans 2017-09-06 08:42
 */
public class CardDeviceDisplayVisitor implements ICardDeviceVisitor {
    @Override
    public void visit(WirelessPos wirelessPos) {
        System.out.println("Have a:" + wirelessPos);
    }

    @Override
    public void visit(Mobile mobile) {
        System.out.println("Have a:" + mobile);
    }

    @Override
    public void visit(WiredPos wiredPos) {
        System.out.println("Have a:" + wiredPos);
    }

    @Override
    public void visit(CardDeviceOrder cardDeviceOrder) {
        System.out.println("Have a:" + cardDeviceOrder);
    }
}
