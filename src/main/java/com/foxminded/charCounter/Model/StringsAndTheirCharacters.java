package com.foxminded.charCounter.Model;

import java.util.LinkedHashMap;

public class StringsAndTheirCharacters {
    LinkedHashMap<String, CollectionOfUniqueCharacters> stringAndItsCharacters = new LinkedHashMap<>();

    public boolean containsKey(String string) {
        if (stringAndItsCharacters.containsKey(string)) {
            return true;
        }
        return false;
    }

    public CollectionOfUniqueCharacters get(String string) {
        return stringAndItsCharacters.get(string);
    }

    public void put(String string, CollectionOfUniqueCharacters collectionOfUniqueCharacters) {
        stringAndItsCharacters.put(string, collectionOfUniqueCharacters);
    }
}

