package com.mjduan.project.src.impl.orc;

import com.mjduan.project.src.IArmy;
import com.mjduan.project.src.ICastle;
import com.mjduan.project.src.IKing;
import com.mjduan.project.src.IKingdomFactory;

/**
 * Hans 2017-06-29 21:11
 */
public class OrcKingdomFactory implements IKingdomFactory {
    @Override
    public ICastle createCastle() {
        return new OrcCastle();
    }

    @Override
    public IKing createKing() {
        return new OrcKing();
    }

    @Override
    public IArmy createArmy() {
        return new OrcArmy();
    }
}
