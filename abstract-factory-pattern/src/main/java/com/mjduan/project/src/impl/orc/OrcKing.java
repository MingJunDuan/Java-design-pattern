package com.mjduan.project.src.impl.orc;

import com.mjduan.project.src.IKing;

/**
 * Hans 2017-06-29 21:09
 */
public class OrcKing implements IKing {
    public static final String DESCRIPTION = "This is the Orc king!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
