package com.caseykulm.multibinddemo;

import android.app.Application;

import com.caseykulm.multibinddemo.di.DaggerMainComponent;
import com.caseykulm.multibinddemo.di.UtilModule;

import javax.inject.Inject;

public class App extends Application {
    @Inject AltNamesMapUtil altNamesMapUtil;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerMainComponent.builder()
            .utilModule(new UtilModule())
            .build()
            .inject(this);
        altNamesMapUtil.prettyPrint();
    }
}
