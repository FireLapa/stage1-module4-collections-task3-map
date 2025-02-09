package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swappedMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            String value = entry.getValue();
            int key = entry.getKey();

            if (swappedMap.containsKey(value) && swappedMap.get(value) < key) {
                continue;
            }
            swappedMap.put(value, key);
        }

        return swappedMap;
    }
}
