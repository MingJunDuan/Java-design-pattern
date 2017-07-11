package com.mjduan.project.src;

import java.util.function.Supplier;

/**
 * Hans 2017-07-11 23:12
 */
public interface IBuilder {

    void add(WeaponType weaponType,Supplier<IWeapon> supplier);

}
