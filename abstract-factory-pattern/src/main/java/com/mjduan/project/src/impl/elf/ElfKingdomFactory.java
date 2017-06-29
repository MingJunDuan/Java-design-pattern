package com.mjduan.project.src.impl.elf;

import com.mjduan.project.src.IArmy;
import com.mjduan.project.src.ICastle;
import com.mjduan.project.src.IKing;
import com.mjduan.project.src.IKingdomFactory;

/**
 * Hans 2017-06-29 21:06
 */
public class ElfKingdomFactory implements IKingdomFactory {
    @Override
    public ICastle createCastle() {
        return new ElfCastleImpl();
    }

    @Override
    public IKing createKing() {
        return new ElfKingImpl();
    }

    @Override
    public IArmy createArmy() {
        return new ElfArmyImpl();
    }
}
