package com.javarush.minka;

import java.io.IOException;

public class CryptoProcessor {
    public void encrypt(String inputFile, String outputFile, int key) throws IOException {
        CryptoAction action = new Encrypt();
        action.process(inputFile, outputFile, key);
    }

    public void decrypt(String inputFile, String outputFile, int key) throws IOException {
        CryptoAction action = new Decrypt();
        action.process(inputFile, outputFile, key);
    }
}
