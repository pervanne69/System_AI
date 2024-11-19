package ru.mirea.lab28.lab28_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CustomMap<K, V> {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Samvel" + i, "Pogosyan" + i);
        }
        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map) {
        String currentKey = "";
        int count = 0;
        for (String key : map.keySet()) {
            if (Objects.equals(key, currentKey)) {
                count += 1;
            }
            currentKey = key;
        }
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map) {
        String currentValue = "";
        int count = 0;
        for (String key : map.values()) {
            if (Objects.equals(key, currentValue)) {
                count += 1;
            }
            currentValue = key;
        }
        return count;
    }

}
