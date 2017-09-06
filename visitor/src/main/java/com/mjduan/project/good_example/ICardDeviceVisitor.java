package com.mjduan.project.good_example;

/**
 * Hans 2017-09-06 08:37
 */
public interface ICardDeviceVisitor {

    void visit(WirelessPos wirelessPos);
    void visit(Mobile mobile);
    void visit(WiredPos wiredPos);
    void visit(CardDeviceOrder cardDeviceOrder);

}
