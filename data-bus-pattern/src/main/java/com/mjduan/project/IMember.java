package com.mjduan.project;

import java.util.function.Consumer;

/**
 * Hans 2017-07-02 20:56
 */
public interface IMember extends Consumer<IDataType>{

    @Override
    void accept(IDataType iDataType);

}
