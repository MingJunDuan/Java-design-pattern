package com.mjduan.project.src.domain;

import com.mjduan.project.src.IWeapon;
import com.mjduan.project.src.WeaponType;

/**
 * Hans 2017-07-11 23:53
 */
public class OrcWeapon implements IWeapon{
    private WeaponType weaponType;

    public OrcWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "Orcish "+weaponType;
    }
}
