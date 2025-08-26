package com.javarush.minka;

public class ConsoleRunner {

    public static void main(String[] args) {
        Cipher cipher = new Cipher(Alphabet.chars);
        cipher.printToConsole();
        new FileManager();
        new Validator();
    }
}