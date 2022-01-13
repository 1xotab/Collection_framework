package com.foxminded.charCounter.Model;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class CollectionOfUniqueCharacters {
    LinkedHashMap <Character, Integer> charactersAndTheirQuantity;

    public CollectionOfUniqueCharacters(LinkedHashMap<Character, Integer> charactersAndTheirQuantity) {
        this.charactersAndTheirQuantity = charactersAndTheirQuantity;
    }
    @Override
    public String toString() {
        Iterator <Map.Entry<Character, Integer>> i = charactersAndTheirQuantity.entrySet().iterator();
        if (!i.hasNext())
            return "{}";

        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (; ; ) {
            Map.Entry<Character, Integer> e = i.next();
            Character key = e.getKey();
            Integer value = e.getValue();
            sb.append("\"" + key + "\"");
            sb.append(" - ");
            sb.append(value);
            if (!i.hasNext())
                break;
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionOfUniqueCharacters collectionOfUniqueCharacters = (CollectionOfUniqueCharacters) o;
        return Objects.equals(charactersAndTheirQuantity, collectionOfUniqueCharacters.charactersAndTheirQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(charactersAndTheirQuantity);
    }
}
