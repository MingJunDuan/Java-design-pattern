package com.mjduan.project.src.impl;

import com.mjduan.project.src.IBattleShip;

/**
 * Hans 2017-06-29 22:12
 */
public class Captain implements IBattleShip {
    private IBattleShip battleShip;

    public Captain() {
    }

    public Captain(IBattleShip battleShip) {
        this.battleShip = battleShip;
    }

    public void setBattleShip(IBattleShip battleShip) {
        this.battleShip = battleShip;
    }

    @Override
    public void fire() {
        battleShip.fire();
    }

    @Override
    public void move() {
        battleShip.move();
    }
}
