package com.javarush.minka;

import java.util.HashMap;
import java.util.Map;

public class Alphabet {
    private Alphabet() {
    }

    private static final String en = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final String rus = "ЙЦУКЕНГШЩЗХЪЭЖДЛОРПАВЫФЯЧСМИТЬБЮ";
    private static final String numbers = "1234567890";
    private static final String symbols = "\n.,”’\":;-!? ()<>";

    public static final char[] chars = (rus + rus.toLowerCase() +
            en + en.toLowerCase() +
            numbers + symbols
    ).toCharArray();

    public static final Map<Character, Integer> indexLetter = new HashMap<>();

    static {
        for (int i = 0; i < chars.length; i++) {
            indexLetter.put(chars[i], i);
        }
    }
}