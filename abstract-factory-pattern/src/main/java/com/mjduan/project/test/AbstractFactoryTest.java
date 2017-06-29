package com.mjduan.project.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.mjduan.project.src.App;
import com.mjduan.project.src.IArmy;
import com.mjduan.project.src.ICastle;
import com.mjduan.project.src.IKing;
import com.mjduan.project.src.IKingdomFactory;
import com.mjduan.project.src.impl.elf.ElfArmyImpl;
import com.mjduan.project.src.impl.elf.ElfCastleImpl;
import com.mjduan.project.src.impl.elf.ElfKingImpl;
import com.mjduan.project.src.impl.elf.ElfKingdomFactory;
import com.mjduan.project.src.impl.orc.OrcArmy;
import com.mjduan.project.src.impl.orc.OrcCastle;
import com.mjduan.project.src.impl.orc.OrcKing;
import com.mjduan.project.src.impl.orc.OrcKingdomFactory;

/**
 * Hans 2017-06-29 21:13
 */
public class AbstractFactoryTest {
    private App app = new App();
    private IKingdomFactory elfFactory;
    private IKingdomFactory orcFactory;

    @Before
    public void before() {
        elfFactory = new ElfKingdomFactory();
        orcFactory = new OrcKingdomFactory();
    }

    @Test
    public void tes_king() {
        final IKing elfKing = app.getKing(elfFactory);
        assertTrue(elfKing instanceof ElfKingImpl);
        assertEquals(ElfKingImpl.DESCRIPTION, elfKing.getDescription());

        final ICastle orcCastle = app.getCastle(orcFactory);
        assertTrue(orcCastle instanceof OrcCastle);
        assertEquals(OrcCastle.DESCRIPTION, orcCastle.getDescription());
    }

    @Test
    public void test_army() {
        final IArmy elfArmy = app.getArmy(elfFactory);
        assertTrue(elfArmy instanceof ElfArmyImpl);
        assertEquals(ElfArmyImpl.DESCRIPTION, elfArmy.getDescription());

        final ICastle orcCastle = app.getCastle(orcFactory);
        assertTrue(orcCastle instanceof OrcCastle);
        assertEquals(OrcCastle.DESCRIPTION, orcCastle.getDescription());
    }

    @Test
    public void test_orcKingdom() {
        app.createKingdom(orcFactory);

        final IKing king = app.getKing();
        final ICastle castle = app.getCastle();
        final IArmy army = app.getArmy();

        assertTrue(king instanceof OrcKing);
        assertEquals(OrcKing.DESCRIPTION, king.getDescription());
        assertTrue(castle instanceof OrcCastle);
        assertEquals(OrcCastle.DESCRIPTION, castle.getDescription());
        assertTrue(army instanceof OrcArmy);
        assertEquals(OrcArmy.DESCRIPTION, army.getDescription());
    }

    @Test
    public void test_elfKingdom() {
        app.createKingdom(elfFactory);
        final IKing king = app.getKing();
        final ICastle castle = app.getCastle();
        final IArmy army = app.getArmy();

        assertTrue(king instanceof ElfKingImpl);
        assertEquals(ElfKingImpl.DESCRIPTION, king.getDescription());
        assertTrue(castle instanceof ElfCastleImpl);
        assertEquals(ElfCastleImpl.DESCRIPTION, castle.getDescription());
        assertTrue(army instanceof ElfArmyImpl);
        assertEquals(ElfArmyImpl.DESCRIPTION, army.getDescription());
    }

}
