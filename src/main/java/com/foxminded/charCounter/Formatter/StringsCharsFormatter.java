package com.foxminded.charCounter.Formatter;

import com.foxminded.charCounter.Model.CollectionOfUniqueCharacters;

public class StringsCharsFormatter {

    public String printStringAndChars(String string, CollectionOfUniqueCharacters setOfChars) {
        return string + setOfChars.toString();
    }
}
