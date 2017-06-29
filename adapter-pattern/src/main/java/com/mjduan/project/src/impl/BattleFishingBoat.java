package com.mjduan.project.src.impl;

import java.util.logging.Logger;

import com.mjduan.project.src.FishingBoat;
import com.mjduan.project.src.IBattleShip;

/**
 * Hans 2017-06-29 22:09
 */
public class BattleFishingBoat implements IBattleShip {
    private Logger LOG = Logger.getLogger(getClass().getName());
    private FishingBoat fishingBoat;

    public BattleFishingBoat() {
        this.fishingBoat = new FishingBoat();
    }

    @Override
    public void fire() {
        LOG.info("fire!");
    }

    @Override
    public void move() {
        fishingBoat.sail();
    }
}
