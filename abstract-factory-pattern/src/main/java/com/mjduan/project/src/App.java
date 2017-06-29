package com.mjduan.project.src;

import java.util.logging.Logger;

import org.junit.Test;

import com.mjduan.project.src.impl.elf.ElfKingdomFactory;

/**
 * Hans 2017-06-29 21:13
 */
public class App {
    private Logger LOG = Logger.getLogger(getClass().getName());

    private IKing king;
    private ICastle castle;
    private IArmy army;

    @Test
    public void test_1(){
        App app = new App();
        app.createKingdom(new ElfKingdomFactory());
        LOG.info("army:"+app.getArmy().getDescription());
        LOG.info("castle:"+app.getCastle().getDescription());
        LOG.info("king:"+app.getKing().getDescription());
    }


    public void createKingdom(final IKingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }

    public IKing getKing(final IKingdomFactory factory) {
        return factory.createKing();
    }

    public IKing getKing() {
        return king;
    }

    private void setKing(final IKing king) {
        this.king = king;
    }

    public ICastle getCastle(final IKingdomFactory factory) {
        return factory.createCastle();
    }

    public ICastle getCastle() {
        return castle;
    }

    private void setCastle(final ICastle castle){
        this.castle = castle;
    }

    public IArmy getArmy(final IKingdomFactory factory) {
        return factory.createArmy();
    }

    public IArmy getArmy(){
        return army;
    }

    private void setArmy(final IArmy army) {
        this.army = army;
    }
}

