package com.mjduan.project.good_example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Hans 2017-09-06 08:41
 */
public class CardDeviceOrder implements ICardDevice {
    private List<ICardDevice> cardDevices = new LinkedList<>();

    public void addPart(ICardDevice cardDevice) {
        cardDevices.add(cardDevice);
    }

    public List<ICardDevice> getCardDevices() {
        return Collections.unmodifiableList(cardDevices);
    }

    @Override
    public void accept(ICardDeviceVisitor cardDeviceVisitor) {
        for (ICardDevice cardDevice : cardDevices) {
            cardDevice.accept(cardDeviceVisitor);
        }
        cardDeviceVisitor.visit(this);
    }
}
