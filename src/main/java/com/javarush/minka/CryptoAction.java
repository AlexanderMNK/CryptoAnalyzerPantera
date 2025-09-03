package com.javarush.minka;

import java.io.*;

public abstract class CryptoAction {
    public void process(String inputFilePath, String outputFilePath, int key) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            int symbol;
            while ((symbol = reader.read()) != -1) {
                char c = (char) symbol;
                char changed = transform(c, key);
                writer.write(changed);
            }
        } catch (RuntimeException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract char transform(char c, int key);

    protected Integer getIndex(char c) {
        return Alphabet.indexLetter.get(c);
    }
}
