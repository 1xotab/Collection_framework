import com.foxminded.charCounter.Formatter.StringsCharsFormatter;
import com.foxminded.charCounter.Model.CollectionOfUniqueCharacters;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringsCharsFormatter {


    StringsCharsFormatter stringsCharsFormatter = new StringsCharsFormatter();

    @Test
    void StringsCharsFormatter_shouldReturnTable_whenInputStringHasSymbols(){

        String string = "hello world!";

        LinkedHashMap<Character, Integer> charactersAndTheirQuantity = new LinkedHashMap<>();
        charactersAndTheirQuantity.put('h',1);
        charactersAndTheirQuantity.put('e',1);
        charactersAndTheirQuantity.put('l',2);
        charactersAndTheirQuantity.put('o',1);
        CollectionOfUniqueCharacters collectionOfUniqueCharacters = new CollectionOfUniqueCharacters(charactersAndTheirQuantity);

        String actual = stringsCharsFormatter.printStringAndChars(string,collectionOfUniqueCharacters);

        String expected = "hello world!" + "\n" +
                           "\"h\" - 1" + "\n" +
                           "\"e\" - 1" + "\n" +
                            "\"l\" - 2" + "\n" +
                            "\"o\" - 1";

        assertEquals(expected, actual);
    }

    @Test
    void StringsCharsFormatter_shouldReturnBrackets_whenInputStringIsEmpty(){

        String string = "";

        LinkedHashMap<Character, Integer> charactersAndTheirQuantity = new LinkedHashMap<>();
        CollectionOfUniqueCharacters collectionOfUniqueCharacters = new CollectionOfUniqueCharacters(charactersAndTheirQuantity);

        String actual = stringsCharsFormatter.printStringAndChars(string,collectionOfUniqueCharacters);

        String expected = "{}";

        assertEquals(expected, actual);
    }
}
