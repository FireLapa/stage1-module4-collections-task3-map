package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        String[] words = sentence.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!word.isEmpty()) {
                int count = wordRepetitionMap.getOrDefault(word, 0);
                wordRepetitionMap.put(word, count + 1);
            }
        }

        return wordRepetitionMap;
    }
}
