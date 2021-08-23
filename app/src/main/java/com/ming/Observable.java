package com.ming;

/**
 * @author Ming
 * 8/23/21
 */
public abstract class Observable<T> implements ObservableSource<T>{

    @Override
    public void subscribe(Observer<T> observer) {
        subscribeActual(observer);
    }

    public static <T> Observable<T> create(ObservableOnSubscribe<T> observableOnSubscribe) {
        return new ObservableCreate(observableOnSubscribe);
    }

    public abstract void subscribeActual(Observer<T> observer);
}
