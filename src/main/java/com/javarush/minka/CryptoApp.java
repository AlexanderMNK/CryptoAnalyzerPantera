package com.javarush.minka;

import java.io.IOException;
import java.util.Scanner;

public class CryptoApp {
    private final CryptoProcessor cryptoProcessor;
    private final Menu menu;
    private final InputParamsReader inputParamsReader;
    private final Scanner scanner;

    public CryptoApp(CryptoProcessor cryptoProcessor, Menu menu, InputParamsReader inputParamsReader, Scanner scanner) {
        this.cryptoProcessor = cryptoProcessor;
        this.menu = menu;
        this.inputParamsReader = inputParamsReader;
        this.scanner = scanner;
    }

    public void run() {
        while (true) {
            int choice = menu.showMainMenu(scanner);
            if (choice == 1) {
                String inputFile = inputParamsReader.readInputFile();
                String outputFile = inputParamsReader.readOutputFile();
                int key = inputParamsReader.readKey();
                try {
                    cryptoProcessor.encrypt(inputFile, outputFile, key);
                    System.out.println("Шифрование завершено! Результат: " + outputFile);
                } catch (RuntimeException | IOException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            } else if (choice == 2) {
                String inputFile = inputParamsReader.readInputFile();
                String outputFile = inputParamsReader.readOutputFile();
                int key = inputParamsReader.readKey();
                try {
                    cryptoProcessor.decrypt(inputFile, outputFile, key);
                    System.out.println("Дешифрование завершено! Результат: " + outputFile);
                } catch (RuntimeException | IOException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            } else if (choice == 3) {
                System.out.println("Выход.");
                break;
            } else {
                System.out.println("Ошибка: некорректный выбор.");
            }
            System.out.println();
        }
    }
}
