package com.foxminded.charCounter.Formatter;

import com.foxminded.charCounter.Model.CollectionOfUniqueCharacters;
import com.foxminded.charCounter.Model.StringsAndTheirCharacters;

public class StringsCharsFormatter {

    public String returnStringAndItsUniqueCharacters(String string,CollectionOfUniqueCharacters setOfChars) {

        return string+setOfChars.toString();
    }
}

