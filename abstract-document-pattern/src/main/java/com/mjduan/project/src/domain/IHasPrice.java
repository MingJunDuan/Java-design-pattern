package com.mjduan.project.src.domain;

import java.util.Optional;

import com.mjduan.project.src.IDocument;

/**
 * Hans 2017-06-29 19:20
 */
public interface IHasPrice extends IDocument{
    String PROPERTY = "price";

    default Optional<Number> getPrice(){
        return Optional.ofNullable((Number)get(PROPERTY));
    }

}
