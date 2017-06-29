package com.mjduan.project.src.impl.elf;

import com.mjduan.project.src.ICastle;

/**
 * Hans 2017-06-29 21:03
 */
public class ElfCastleImpl implements ICastle {
    public static final String DESCRIPTION = "This is the Elven castle";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
