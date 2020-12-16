package com.annakhuseinova.rxjava.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ObservableUsingJust {

    public static void main(String[] args) {
        Observable.just("a", "b", "c", "d", "e", "f", "g", "h", "i", "j").subscribe(new Observer<String>() {

            @Override
            public void onSubscribe(Disposable disposable) {

            }

            @Override
            public void onNext(String s) {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {

            }
        });

    }
}
