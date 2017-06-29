package com.mjduan.project.src.impl.orc;

import com.mjduan.project.src.ICastle;

/**
 * Hans 2017-06-29 21:08
 */
public class OrcCastle implements ICastle {
    public static final String DESCRIPTION = "This is the Orc castle";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
