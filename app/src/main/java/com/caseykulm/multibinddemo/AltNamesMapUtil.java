package com.caseykulm.multibinddemo;

import java.util.Map;

public class AltNamesMapUtil {
    private final Map<String, String> map;

    public AltNamesMapUtil(Map<String, String> map) {
        this.map = map;
        if (map.isEmpty()) {
            System.out.println("Map is empty!");
        }
    }

    public void prettyPrint() {
        for (String key : map.keySet()) {
            System.out.print(map.get(key) + " is a nickname for " + key);
        }
    }
}
