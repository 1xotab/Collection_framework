import com.foxminded.charCounter.Model.CollectionOfUniqueCharacters;
import com.foxminded.charCounter.calculator.CharCounter;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCharCounter {

    CharCounter charCounter = new CharCounter();

    @Test
    void CharCounter_shouldThrowException_whenInputStringIsNull(){

        assertThrows(NullPointerException.class, () -> charCounter.returnSetOfCharacters(null));

    }

    @Test
    void CharCounter_shouldReturnEmptyCollection_whenInputStringIsEmpty(){

        String string = "";

        CollectionOfUniqueCharacters actual = charCounter.returnSetOfCharacters(string);

        LinkedHashMap<Character, Integer> charactersAndTheirQuantity = new LinkedHashMap<>();
        CollectionOfUniqueCharacters expected = new CollectionOfUniqueCharacters(charactersAndTheirQuantity);

        assertEquals(expected, actual);
    }

    @Test
    void CharCounter_shouldReturnSetOfChars_whenInputStringHasSymbols(){

        String string = "hello";

        CollectionOfUniqueCharacters actual = charCounter.returnSetOfCharacters(string);

        LinkedHashMap<Character, Integer> charactersAndTheirQuantity = new LinkedHashMap<>();
        charactersAndTheirQuantity.put('h',1);
        charactersAndTheirQuantity.put('e',1);
        charactersAndTheirQuantity.put('l',2);
        charactersAndTheirQuantity.put('o',1);
        CollectionOfUniqueCharacters expected = new CollectionOfUniqueCharacters(charactersAndTheirQuantity);

        assertEquals(expected, actual);
    }

    @Test
    void CharCounter_shouldReturnSetOfChars_whenInputStringHasSymbolsWithDifferentRegister(){

        String string = "HhEeLlLlOo";

        CollectionOfUniqueCharacters actual = charCounter.returnSetOfCharacters(string);

        LinkedHashMap<Character, Integer> charactersAndTheirQuantity = new LinkedHashMap<>();
        charactersAndTheirQuantity.put('h',1);
        charactersAndTheirQuantity.put('e',1);
        charactersAndTheirQuantity.put('l',2);
        charactersAndTheirQuantity.put('o',1);
        charactersAndTheirQuantity.put('H',1);
        charactersAndTheirQuantity.put('E',1);
        charactersAndTheirQuantity.put('L',2);
        charactersAndTheirQuantity.put('O',1);
        CollectionOfUniqueCharacters expected = new CollectionOfUniqueCharacters(charactersAndTheirQuantity);

        assertEquals(expected, actual);
    }



}
