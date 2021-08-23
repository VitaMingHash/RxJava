package com.ming;

/**
 * @author Ming
 * 8/23/21
 */
public interface Emitter<T> {
    void onNext(T t);
    void onError(Throwable throwable);
    void onComplete();
}
