package com.ming.map;

import com.ming.Observable;
import com.ming.ObservableSource;

/**
 * @author Ming
 * 8/24/21
 */
public abstract class AbstractObservableWithUpStream<T,V> extends Observable<V> {
    protected final ObservableSource<T> observable;

    public AbstractObservableWithUpStream(ObservableSource<T> observable) {
        this.observable = observable;
    }
}
