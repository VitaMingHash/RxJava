package com.ming;

/**
 * @author Ming
 * 8/23/21
 */
public class ObservableCreate<T> extends Observable<T> {
    private ObservableOnSubscribe<T> observableOnSubscribe;
    public ObservableCreate(ObservableOnSubscribe<T> observableOnSubscribe) {
        this.observableOnSubscribe = observableOnSubscribe;
    }


    @Override
    public void subscribeActual(Observer<T> observer) {
        CreateEmitter<T> createEmitter = new CreateEmitter(observer);
        observer.onSubscribe();
        try {
            observableOnSubscribe.subscribe(createEmitter);
        }catch (Throwable throwable){
            createEmitter.onError(throwable);
        }
        createEmitter.onComplete();
    }

    public class CreateEmitter<T> implements Emitter<T> {
        private Observer<T> observer;
        public CreateEmitter(Observer<T> observer){
            this.observer = observer;
        }


        @Override
        public void onNext(T t) {
            observer.onNext(t);
        }

        @Override
        public void onError(Throwable throwable) {
            observer.onError(throwable);
        }

        @Override
        public void onComplete() {
            observer.onComplete();
        }
    }
}
