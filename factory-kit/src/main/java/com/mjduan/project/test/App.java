package com.mjduan.project.test;

import org.junit.Test;

import com.mjduan.project.src.IWeapon;
import com.mjduan.project.src.IWeaponFactory;
import com.mjduan.project.src.WeaponType;
import com.mjduan.project.src.domain.Axe;
import com.mjduan.project.src.domain.Bow;
import com.mjduan.project.src.domain.Spear;
import com.mjduan.project.src.domain.Sword;

/**
 * Hans 2017-07-11 23:31
 */
public class App {

    @Test
    public void test(){
        IWeaponFactory factory = IWeaponFactory.factory(iBuilder -> {
            iBuilder.add(WeaponType.SWORD, Sword::new);
            iBuilder.add(WeaponType.AXE, Axe::new);
            iBuilder.add(WeaponType.SPEAR, Spear::new);
            iBuilder.add(WeaponType.BOW, Bow::new);
        });
        IWeapon axe = factory.create(WeaponType.AXE);
        System.out.println(axe.toString());
    }


}
