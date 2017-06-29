package com.mjduan.project.src.domain;

import java.util.Optional;

import com.mjduan.project.src.IDocument;

/**
 * Hans 2017-06-29 19:15
 */
public interface IHasModel extends IDocument {

    String PROPERTY = "model";

    default Optional<String> getModel(){
        return Optional.ofNullable((String)get(PROPERTY));
    }

}
