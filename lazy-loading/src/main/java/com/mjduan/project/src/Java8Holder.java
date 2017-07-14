package com.mjduan.project.src;

import java.util.function.Supplier;

/**
 * Hans 2017-07-15 00:19
 */
public class Java8Holder {
    private Supplier<Heavy> heavy = () -> createAndCacheHeavy();

    public Java8Holder() {
        System.out.println("Java8 holder created");
    }

    public Supplier<Heavy> getHeavy() {
        return heavy;
    }

    private synchronized Heavy createAndCacheHeavy() {
        class HeavyFactory implements Supplier<Heavy> {
            private final Heavy heavyInstance = new Heavy();

            @Override
            public Heavy get() {
                return heavyInstance;
            }
        }
        if (!HeavyFactory.class.isInstance(heavy)) {
            heavy = new HeavyFactory();
        }
        return heavy.get();
    }
}
