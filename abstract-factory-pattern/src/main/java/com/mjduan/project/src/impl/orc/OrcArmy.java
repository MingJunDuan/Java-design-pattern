package com.mjduan.project.src.impl.orc;

import com.mjduan.project.src.IArmy;

/**
 * Hans 2017-06-29 21:07
 */
public class OrcArmy implements IArmy {
    public static final String DESCRIPTION = "This is the Orc Army!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
