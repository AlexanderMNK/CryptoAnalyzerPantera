package com.javarush.minka;

public class ConsoleRunner {

    public static void main(String[] args) {
        // Шаг 1: кодируем текст.
        
        // Эта строка создана в GitHub.
        String ALPHABET = "тут будет наш алфавит";
        Cipher cipher = new Cipher(ALPHABET.toCharArray());
        cipher.printToConsole();

    }
}