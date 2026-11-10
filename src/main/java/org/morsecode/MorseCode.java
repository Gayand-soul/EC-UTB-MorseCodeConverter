package org.morsecode;

import java.util.HashMap;
import java.util.Map;



public class MorseCode {

    //Hashmap för eng -> Morse
    private final Map<Character, String> englihToMorse = new HashMap<>();

    //Hashmap för Morse -> eng
    private final Map<String, Character> morseToEnglish = new HashMap<>();

    //metod för att kombinera Morse med Eng
    public MorseCode() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] codes = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        //fylla i båda samtidigt och matchar varandra
        for(int i = 0; i < letters.length(); i++ ) {
            englihToMorse.put(letters.charAt(i), codes[i]);
            morseToEnglish.put(codes[i], letters.charAt(i));

        }
    }

    //EN -> Morse
    public String toMorse(String text) {
        if(text == null || text.isBlank()) {
            throw new IllegalArgumentException("text cannot be null or blank");
        }
        //inbyggt i Java
        StringBuilder result = new StringBuilder();
        for(char c: text.toUpperCase().toCharArray()) {
            if(c == ' '){
                continue;
            }
            String code = englihToMorse.get(c);
            if(code == null) {
                throw new IllegalArgumentException("cannot find english letter " + c);
            }
            if(result.length() > 0) {
                result.append(" ");

            }
            result.append(code);
        }
        return result.toString();
    }

    //Morse -> Eng
    public String toEnglish(String morse) {
        if(morse == null || morse.isBlank()) {
            throw new IllegalArgumentException("Morse cannot be null or blank");
        }
        StringBuilder result = new StringBuilder();
        for(String code: morse.trim().split("\\s+")){
            Character letter = morseToEnglish.get(code);
            if(letter == null) {
                throw new IllegalArgumentException("cannot find english letter " + code);
            }
            result.append(letter);
        }
        return result.toString();
    }
}
