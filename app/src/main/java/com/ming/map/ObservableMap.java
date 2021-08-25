package com.ming.map;

import android.util.Log;

import com.ming.Observable;
import com.ming.Observer;

/**
 * @author Ming
 * 8/24/21
 */
public class ObservableMap<T, V> extends AbstractObservableWithUpStream<T, V> {
    final Function<T, V> function;

    public ObservableMap(Observable observable, Function<T, V> function) {
        super(observable);
        this.function = function;
    }

    @Override
    public void subscribeActual(Observer<V> observer) {
        observable.subscribe(new MapObserver<>(observer, function));
    }


    static final class MapObserver<T, U> extends BasicFuseableObserver<T, U> {

        final Function<T, U> fun;

        public MapObserver(Observer<U> actual, Function<T, U> fun) {
            super(actual);
            this.fun = fun;
        }

        @Override
        public void onNext(T t) {
            U apply = fun.apply(t);
            observer.onNext(apply);
        }
    }
}
