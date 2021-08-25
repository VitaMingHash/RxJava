package com.ming;

import com.ming.map.Function;
import com.ming.map.ObservableMap;

/**
 * @author Ming
 * 8/23/21
 */
public abstract class Observable<T> implements ObservableSource<T> {

    @Override
    public void subscribe(Observer<T> observer) {
        subscribeActual(observer);
    }

    public static <T> Observable create(ObservableOnSubscribe<T> observableOnSubscribe) {
        return new ObservableCreate(observableOnSubscribe);
    }

    public <V> Observable map(Function<T, V> fun) {
        return new ObservableMap(this, fun);
    }

    public abstract void subscribeActual(Observer<T> observer);
}
