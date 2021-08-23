package com.ming;

/**
 * @author Ming
 * 8/23/21
 */
public interface ObservableSource<T> {
    void subscribe(Observer<T> observer);
}
