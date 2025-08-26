package com.javarush.minka;

import java.util.Arrays;

public class Cipher {

    public char[] alphabet;
    public Cipher(char[] alphabet) {
        this.alphabet = alphabet;
    }

    public void printToConsole() {
        System.out.println(Arrays.toString(alphabet));
    }

//    public String encrypt(String text, int shift) {
//        // Логика шифрования
//        return "";
//    }
//    public String decrypt(String encryptedText, int shift) {
//        // Логика расшифровки
//        return "";
//    }
}