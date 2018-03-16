package com.caseykulm.multibinddemo;

import android.app.Application;

import com.caseykulm.multibinddemo.di.DaggerMainComponent;

import javax.inject.Inject;
import javax.inject.Named;

import static com.caseykulm.multibinddemo.di.ConciseModule.ALT_UTIL_CONCISE;
import static com.caseykulm.multibinddemo.di.VerboseModule.ALT_UTIL_VERBOSE;

public class App extends Application {
    @Inject @Named(ALT_UTIL_CONCISE) AltNamesMapUtil altNamesMapUtilConcise;
    @Inject @Named(ALT_UTIL_VERBOSE) AltNamesMapUtil altNamesMapUtilVerbose;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerMainComponent.builder()
            .build()
            .inject(this);
        altNamesMapUtilConcise.prettyPrint();
        altNamesMapUtilVerbose.prettyPrint();
    }
}
