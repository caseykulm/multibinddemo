package com.caseykulm.multibinddemo;

import android.util.Log;

import java.util.Map;

public class AltNamesMapUtil {
    private final String name;
    private final Map<String, String> map;

    public AltNamesMapUtil(String name, Map<String, String> map) {
        this.name = name;
        this.map = map;
        if (map == null) {
            Log.d(name, "Map is null");
        } else if (map.isEmpty()) {
            Log.d(name, "Map is empty!");
        }
    }

    public void prettyPrint() {
        Log.d(name, "prettyPrinting " + map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Log.d(name, entry.getValue() + " is a nickname for " + entry.getKey());
        }
    }
}
