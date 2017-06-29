package com.mjduan.project.src.domain;

import java.util.stream.Stream;

import com.mjduan.project.src.IDocument;

/**
 * Hans 2017-06-29 19:17
 */
public interface IHasParts extends IDocument{

    String PROPERTY = "parts";

    default Stream<Part> getParts(){
        return children(PROPERTY, Part::new);
    }

}
