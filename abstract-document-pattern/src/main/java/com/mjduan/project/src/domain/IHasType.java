package com.mjduan.project.src.domain;

import java.util.Optional;

import com.mjduan.project.src.IDocument;

/**
 * Hans 2017-06-29 19:22
 */
public interface IHasType extends IDocument {
    String PROPERTY = "type";

    default Optional<String> getType(){
        return Optional.ofNullable((String)get(PROPERTY));
    }
}
