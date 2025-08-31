package com.javarush.minka;

public class Decrypt extends CryptoAction {
    @Override
    protected char transform(char c, int key) {
        Integer index = getIndex(c);
        if (index == null) return c;
        int newIndex = (index - key) % Alphabet.chars.length;
        if (newIndex < 0) newIndex += Alphabet.chars.length;
        return Alphabet.chars[newIndex];
    }
}
