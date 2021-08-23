package com.ming;

/**
 * @author Ming
 * 8/23/21
 */
public interface ObservableEmitter<T> {
    void onNext(T t);
    void onError(Throwable throwable);
    void onComplete();
}
