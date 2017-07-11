package com.mjduan.project.src.domain.domain;

import com.mjduan.project.src.BlackSmith;
import com.mjduan.project.src.IWeapon;
import com.mjduan.project.src.WeaponType;
import com.mjduan.project.src.domain.ElfWeapon;

/**
 * Hans 2017-07-11 23:59
 */
public class ElfBlacksmith implements BlackSmith {

    public IWeapon manufactureWeapon(WeaponType weaponType){
        return new ElfWeapon(weaponType);
    }

}
