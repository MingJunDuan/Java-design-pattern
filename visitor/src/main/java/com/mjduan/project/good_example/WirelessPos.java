package com.mjduan.project.good_example;

/**
 * Hans 2017-09-06 08:39
 */
public class WirelessPos implements ICardDevice {
    @Override
    public void accept(ICardDeviceVisitor cardDeviceVisitor) {
        cardDeviceVisitor.visit(this);
    }
}
