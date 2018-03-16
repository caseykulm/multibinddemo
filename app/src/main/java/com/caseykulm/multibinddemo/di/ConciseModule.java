package com.caseykulm.multibinddemo.di;

import com.caseykulm.multibinddemo.AltNamesMapUtil;

import java.util.Map;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.Multibinds;
import dagger.multibindings.StringKey;

@Module
public abstract class ConciseModule {
    private static final String ALT_NAMES_CONCISE = "alt_names_concise";
    public static final String ALT_UTIL_CONCISE = "alt_util_concise";

    /*
     * The trick that I was struggling with is that EACH @Provides @IntoMap also needs
     * to be tagged with the correct Qualifier annotation to know which map to contribute
     * to, if you want to use the Qualified map as input to another @Provide method
     *
     * "To contribute to a qualified multibound set, annotate each @Provides method with the qualifier"
     * - https://google.github.io/dagger/multibindings
     */

    @Multibinds @Named(ALT_NAMES_CONCISE) abstract Map<String, String> provideAltNameMapConcise();

    @Provides @IntoMap @Named(ALT_NAMES_CONCISE) @StringKey("Joseph")
    static String provideJosephAltName() {
        return "Joe";
    }

    @Provides @IntoMap @Named(ALT_NAMES_CONCISE) @StringKey("Rebecca")
    static String provideRebeccaAltName() {
        return "Becca";
    }

    @Provides @Named(ALT_UTIL_CONCISE)
    static AltNamesMapUtil provideAltNamesMapUtil(@Named(ALT_NAMES_CONCISE) Map<String, String> altNames) {
        return new AltNamesMapUtil("CONCISE", altNames);
    }
}
