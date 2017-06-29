package com.mjduan.project.src.impl.elf;

import com.mjduan.project.src.IKing;

/**
 * Hans 2017-06-29 21:04
 */
public class ElfKingImpl implements IKing{
    public static final String DESCRIPTION = "This is the Elven king";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
