package com.mjduan.project.src;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Hans 2017-07-11 23:09
 */
public interface IWeaponFactory {

    static IWeaponFactory factory(Consumer<IBuilder> consumer) {
        Map<WeaponType, Supplier<IWeapon>> map = new HashMap<>();
        consumer.accept(new IBuilder() {
            @Override
            public void add(WeaponType weaponType, Supplier<IWeapon> supplier) {
                map.put(weaponType, supplier);
            }
        });
        return weaponType -> map.get(weaponType).get();
    }

    IWeapon create(WeaponType weaponType);

}
