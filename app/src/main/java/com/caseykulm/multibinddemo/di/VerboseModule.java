package com.caseykulm.multibinddemo.di;

import com.caseykulm.multibinddemo.AltNamesMapUtil;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class VerboseModule {
    private static final String ALT_NAMES_VERBOSE = "alt_names_verbose";
    public static final String ALT_UTIL_VERBOSE = "alt_util_verbose";

    @Provides @Named(ALT_NAMES_VERBOSE)
    static Map<String, String> provideAltNameMapConcise() {
        Map<String, String> altNames = new HashMap<>();
        altNames.put("Joseph", "Joe");
        altNames.put("Rebecca", "Becca");
        return altNames;
    }

    @Provides @Named(ALT_UTIL_VERBOSE)
    static AltNamesMapUtil provideAltNamesMapUtil(@Named(ALT_NAMES_VERBOSE) Map<String, String> altNames) {
        return new AltNamesMapUtil("VERBOSE", altNames);
    }
}

