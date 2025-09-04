package com.javarush.minka;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
        DefaultFilePathBuilder filePathBuilder = new DefaultFilePathBuilder();
        InputParamsReader inputParamsReader = new InputParamsReader(scanner, filePathBuilder);
        CryptoProcessor cryptoProcessor = new CryptoProcessor();
        CryptoApp cryptoApp = new CryptoApp(cryptoProcessor, menu, inputParamsReader, scanner);

        cryptoApp.run();
    }
}