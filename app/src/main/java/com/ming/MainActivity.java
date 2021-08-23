package com.ming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) {
                emitter.onNext("123");
            }
        }).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe() {
                Log.e("onSubscribe", "0");
            }

            @Override
            public void onNext(String s) {
                Log.e("onNext", s);
            }

            @Override
            public void onError(Throwable e) {
                Log.e("onError", "1");
            }

            @Override
            public void onComplete() {
                Log.e("onComplete", "2");
            }
        });
    }
}