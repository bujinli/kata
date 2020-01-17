package com.example.test.kata.lettertilepossibilities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LetterTilePossibilities {

    public int numTilePossibilities(String tiles) {
        Map<Character, Integer> map = new HashMap<>();

        Set<String> ret = new HashSet<>();
        for (Character c : tiles.toCharArray()) {
            map.computeIfPresent(c, (ch, i) -> i + 1);
            map.putIfAbsent(c, 1);
        }
        help("", map, ret);


        return ret.size();
    }


    public void help(String word, Map<Character, Integer> map, Set ret) {

        for (Map.Entry en : map.entrySet()) {
            if ((Integer) en.getValue() != 0) {

                ret.add(word + en.getKey());

                Map<Character, Integer> newMap = new HashMap<>(map);
                Integer value = (Integer) en.getValue() - 1;
                newMap.put((Character) en.getKey(), value);


                help(word + en.getKey(), newMap, ret);
            }
        }
    }
}
