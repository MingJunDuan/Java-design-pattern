package com.mjduan.project.good_example;

/**
 * Hans 2017-09-06 08:38
 */
public class Mobile implements ICardDevice {
    @Override
    public void accept(ICardDeviceVisitor cardDeviceVisitor) {
        cardDeviceVisitor.visit(this);
    }
}
