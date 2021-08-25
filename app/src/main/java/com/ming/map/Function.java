package com.ming.map;

/**
 * @author Ming
 * 8/24/21
 */
public interface Function<T, V> {
    V apply(T t);
}
