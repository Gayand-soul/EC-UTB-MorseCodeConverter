
package org.morsecode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class MorseCodeTest {

    @Test
    void shouldConvertAtoMorse(){
        MorseCode converter = new MorseCode();

        assertEquals(".-", converter.toMorse("A"));

    }

    @Test
    void shouldConvertMorseToA(){
        MorseCode converter = new MorseCode();
        assertEquals("A", converter.toEnglish(".-"));
    }
    @Test
    void shouldConvertHelloToMorse(){
        MorseCode converter = new MorseCode();
        assertEquals( ".... . .-.. .-.. ---",
                converter.toMorse("HELLO"));
    }
    @Test
    void shouldConvertMorseToHello(){
        MorseCode converter = new MorseCode();
        assertEquals("HELLO", converter.toEnglish(".... . .-.. .-.. ---"));
    }

    //Felhantering fångas
    // Testar felaktiga tecken
    @Test
    void testWrongCharacters() {
        MorseCode converter = new MorseCode();

        try {
            converter.toMorse("HELLO!");
            fail("Programmet borde visa ett fel!");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }


    // Testar felaktig morsekod
    @Test
    void testWrongMorseCode() {
        MorseCode converter = new MorseCode();

        try {
            converter.toEnglish(".....");
            fail("Programmet borde visa ett fel!");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    void shouldIngnoreSpaceBetweenWords(){
        MorseCode converter = new MorseCode();
        assertEquals(".... . .-.. .-.. --- .-- --- .-. .-.. -..",
                converter.toMorse("HELLO WORLD"));
    }
    @Test
    void shouldHandleLowercase() {
        MorseCode converter = new MorseCode();
        assertEquals(".... . .---", converter.toMorse("hej"));
    }

    @Test
    void shouldRejectEmptyInput() {
        MorseCode converter = new MorseCode();
        assertThrows(IllegalArgumentException.class, () -> converter.toMorse("   "));
    }



}

