package com.ming;

/**
 * @author Ming
 * 8/23/21
 */
public interface ObservableOnSubscribe<T> {
    void subscribe(Emitter<T> emitter);
}
