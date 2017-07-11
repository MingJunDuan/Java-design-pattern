package com.mjduan.project.src.domain.domain;

import com.mjduan.project.src.BlackSmith;
import com.mjduan.project.src.IWeapon;
import com.mjduan.project.src.WeaponType;
import com.mjduan.project.src.domain.OrcWeapon;

/**
 * Hans 2017-07-11 23:57
 */
public class OrcBlacksmith implements BlackSmith {

    public IWeapon manufactureWeapon(WeaponType weaponType){
        return new OrcWeapon(weaponType);
    }

}
