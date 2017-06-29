package com.mjduan.project.src.domain;

import java.util.Map;

import com.mjduan.project.src.AbstractDocument;

/**
 * Hans 2017-06-29 19:32
 */
public class Car extends AbstractDocument implements IHasModel,IHasPrice,IHasParts{
    public Car(Map<String, Object> properties) {
        super(properties);
    }
}
