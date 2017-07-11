package com.mjduan.project.src;

/**
 * Hans 2017-07-11 23:51
 */
public enum WeaponType {
    SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe"), UNDEFINED("");

    private String title;

    WeaponType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
