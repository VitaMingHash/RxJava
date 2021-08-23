package com.ming;

/**
 * @author Ming
 * 8/23/21
 */
public interface Observer<T> {

    void onSubscribe();
    void onNext(T t);
    void onError(Throwable e);
    void onComplete();
}
