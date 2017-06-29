package com.mjduan.project.src.domain;

import java.util.Map;

import com.mjduan.project.src.AbstractDocument;

/**
 * Hans 2017-06-29 19:18
 */
public class Part extends AbstractDocument implements IHasPrice,IHasType,IHasModel {
    public Part(Map<String, Object> properties) {
        super(properties);
    }
}
