package com.caseykulm.multibinddemo;

import android.util.Log;

import java.util.Map;

public class AltNamesMapUtil {
    private final Map<String, String> map;

    public AltNamesMapUtil(Map<String, String> map) {
        this.map = map;
        if (map == null) {
            Log.d("AltNamesMapUtil", "Map is null");
        } else if (map.isEmpty()) {
            Log.d("AltNamesMapUtil", "Map is empty!");
        }
    }

    public void prettyPrint() {
        Log.d("AltNamesMapUtil", "prettyPrinting " + map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Log.d("AltNamesMapUtil", entry.getValue() + " is a nickname for " + entry.getKey());
        }
    }
}
