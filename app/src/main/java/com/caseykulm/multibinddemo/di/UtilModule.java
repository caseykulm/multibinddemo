package com.caseykulm.multibinddemo.di;

import com.caseykulm.multibinddemo.AltNamesMapUtil;

import java.util.Map;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

import static com.caseykulm.multibinddemo.di.StuffModule.ALT_NAMES;

@Module
public class UtilModule {
    @Provides
    public AltNamesMapUtil provideAltNameMapUtil(@Named(ALT_NAMES) Map<String, String> altNames) {
        return new AltNamesMapUtil(altNames);
    }
}
