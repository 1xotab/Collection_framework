package com.foxminded.charCounter.calculator;

import com.foxminded.charCounter.Model.CollectionOfUniqueCharacters;
import com.foxminded.charCounter.Model.StringsAndTheirCharacters;

public class CounterWithCash implements CharCounterInt{

    SimpleCounter counter = new SimpleCounter();
    StringsAndTheirCharacters dataBase = new StringsAndTheirCharacters();

    @Override
    public CollectionOfUniqueCharacters countCharsInString(String string) {

        CollectionOfUniqueCharacters setOfChars = counter.countCharsInString(string);

        if (dataBase.containsKey(string)) {
            return dataBase.get(string);
        }

        dataBase.put(string, setOfChars);

        return setOfChars;
    }
}
