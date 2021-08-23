package com.ming;

/**
 * @author Ming
 * 8/23/21
 */
public interface ObservableOnSubscribe<T> {
    void subscribe(ObservableEmitter<T> emitter);
}
