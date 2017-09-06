package com.mjduan.project.bad_example;

import java.util.LinkedList;
import java.util.List;

/**
 * Hans 2017-09-06 09:43
 */
public class CardDeviceOrder implements ICardDevice {
    private List<ICardDevice> cardDevices = new LinkedList<>();

    public void addPart(ICardDevice cardDevice) {
        cardDevices.add(cardDevice);
    }

    public List<ICardDevice> getCardDevices() {
        return cardDevices;
    }

    @Override
    public double calculateShipping() {
        double shippingCost = 0;
        for (final ICardDevice cardDevice : cardDevices) {
            shippingCost += cardDevice.calculateShipping();
        }
        return shippingCost;
    }
}
