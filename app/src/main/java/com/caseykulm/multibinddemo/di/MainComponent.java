package com.caseykulm.multibinddemo.di;

import com.caseykulm.multibinddemo.App;

import java.util.Map;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = StuffModule.class)
public interface MainComponent {
    void inject(App app);
}
