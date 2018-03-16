package com.caseykulm.multibinddemo;

import android.app.Application;

import com.caseykulm.multibinddemo.di.DaggerMainComponent;

import javax.inject.Inject;

public class App extends Application {
    @Inject AltNamesMapUtil altNamesMapUtil;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerMainComponent.builder()
            .build()
            .inject(this);
        altNamesMapUtil.prettyPrint();
    }
}
