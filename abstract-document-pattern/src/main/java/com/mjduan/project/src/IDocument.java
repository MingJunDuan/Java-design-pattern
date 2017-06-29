package com.mjduan.project.src;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Hans 2017-06-29 19:01
 */
public interface IDocument {

   Object get(String key);

   Void put(String key,Object value);

   <T> Stream<T> children(String key, Function<Map<String,Object>,T> constructor);

}
