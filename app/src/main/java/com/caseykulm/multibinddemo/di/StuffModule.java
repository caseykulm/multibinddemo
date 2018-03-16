package com.caseykulm.multibinddemo.di;

import com.caseykulm.multibinddemo.AltNamesMapUtil;

import java.util.Map;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.Multibinds;
import dagger.multibindings.StringKey;

@Module
abstract class StuffModule {
    private static final String ALT_NAMES = "alt_names";

    @Multibinds @Named(ALT_NAMES) abstract Map<String, String> provideAltNameMap();

    @Provides @IntoMap @StringKey("Joseph")
    static String provideJosephAltName() {
        return "Joe";
    }

    @Provides @IntoMap @StringKey("Rebecca")
    static String provideRebeccaAltName() {
        return "Becca";
    }

    @Provides
    static AltNamesMapUtil provideAltNamesMapUtil(@Named(ALT_NAMES)  Map<String, String> altNames) {
        return new AltNamesMapUtil(altNames);
    }
}
