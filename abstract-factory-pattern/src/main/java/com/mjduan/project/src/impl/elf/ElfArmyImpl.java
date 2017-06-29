package com.mjduan.project.src.impl.elf;

import com.mjduan.project.src.IArmy;

/**
 * Hans 2017-06-29 21:01
 */
public class ElfArmyImpl implements IArmy {

    public static final String DESCRIPTION = "This is the Elven army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
