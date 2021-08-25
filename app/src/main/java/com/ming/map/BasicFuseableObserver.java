package com.ming.map;


import com.ming.Observer;

public abstract class BasicFuseableObserver<T,V> implements Observer<T> {

    protected final Observer<V> observer;

    public BasicFuseableObserver(Observer<V> observer) {
        this.observer = observer;
    }

    @Override
    public void onSubscribe() {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
