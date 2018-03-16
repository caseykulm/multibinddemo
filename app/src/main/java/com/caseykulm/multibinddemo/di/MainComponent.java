package com.caseykulm.multibinddemo.di;

import com.caseykulm.multibinddemo.App;

import javax.inject.Singleton;

import dagger.Component;

@Singleton @Component(modules = {ConciseModule.class, VerboseModule.class})
public interface MainComponent {
    void inject(App app);
}
