package com.javarush.minka;

public class ConsoleRunner {

    public static void main(String[] args) {
        String ALPHABET = "тут будет наш алфавит";
        Cipher cipher = new Cipher(ALPHABET.toCharArray());
        cipher.printToConsole();
        new FileManager();
        new Validator();
    }
}