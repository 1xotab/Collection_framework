package com.foxminded.charCounter;

import com.foxminded.charCounter.Formatter.StringsCharsFormatter;
import com.foxminded.charCounter.calculator.CharCounter;

public class Application {
    public static void main(String[] args) {
        String string1 = "";
        String string2 = "sosiska";
        String string3 = "polka";

        CharCounter charCounter = new CharCounter();
        StringsCharsFormatter stringsCharsFormatter = new StringsCharsFormatter();

        charCounter.returnSetOfCharacters(string1);
        charCounter.returnSetOfCharacters(string2);
        charCounter.returnSetOfCharacters(string3);
        charCounter.returnSetOfCharacters(string1);

        System.out.println(stringsCharsFormatter.printStringAndChars(string1,charCounter.returnSetOfCharacters(string1)));
    }
}
