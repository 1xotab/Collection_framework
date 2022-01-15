package com.foxminded.charCounter.calculator;

import com.foxminded.charCounter.Model.CollectionOfUniqueCharacters;
import com.foxminded.charCounter.Model.StringsAndTheirCharacters;

import java.util.LinkedHashMap;

public class SimpleCounter implements CharCounterInt {

    @Override
    public CollectionOfUniqueCharacters countCharsInString(String string) {

        char[] array = string.toCharArray();
        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();

        for (Character character : array) {
            if (result.containsKey(character)) {
                result.replace(character, result.get(character) + 1);
            }
            result.putIfAbsent(character, 1);
        }
        return new CollectionOfUniqueCharacters(result);
    }
}

