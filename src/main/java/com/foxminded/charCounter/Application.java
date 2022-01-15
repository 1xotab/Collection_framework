package com.foxminded.charCounter;

import com.foxminded.charCounter.Formatter.StringsCharsFormatter;
import com.foxminded.charCounter.Model.CollectionOfUniqueCharacters;
import com.foxminded.charCounter.Model.StringsAndTheirCharacters;
import com.foxminded.charCounter.calculator.CounterWithCash;
import com.foxminded.charCounter.calculator.SimpleCounter;

public class Application {
    public static void main(String[] args) {
        String string1 = "hello world!";
        String string2 = "sosiska";
        String string3 = "polka";

        CounterWithCash counter = new CounterWithCash();
        StringsCharsFormatter formatter = new StringsCharsFormatter();

       CollectionOfUniqueCharacters setOfChars = counter.countCharsInString(string1);
        System.out.println(formatter.returnStringAndItsUniqueCharacters(string1,setOfChars));

    }
}

