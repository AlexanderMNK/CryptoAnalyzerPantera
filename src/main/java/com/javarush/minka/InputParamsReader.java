package com.javarush.minka;

import java.io.File;
import java.util.Scanner;

public class InputParamsReader {
    private static final String DEFAULT_DIRECTORY = System.getProperty("user.dir") +
            File.separator + "text" + File.separator;
    private static final String DEFAULT_SOURCE_FILE = DEFAULT_DIRECTORY + "text.txt";
    private static final String DEFAULT_OUTPUT_FILE = DEFAULT_DIRECTORY + "output.txt";
    private final Scanner scanner;
    private final DefaultFilePathBuilder filePathBuilder;

    public InputParamsReader(Scanner scanner, DefaultFilePathBuilder filePathBuilder) {
        this.scanner = scanner;
        this.filePathBuilder = filePathBuilder;
    }

    public String readInputFile() {
        System.out.print("Исходный файл по умолчанию для шифрования/дешифрования " + DEFAULT_SOURCE_FILE + " (y/n): ");
        String useDefault = scanner.nextLine();
        if (useDefault.equalsIgnoreCase("y")) {
            return filePathBuilder.buildAbsolutePath(DEFAULT_SOURCE_FILE);
        }
        System.out.print("Введите абсолютный путь к исходному файлу: ");
        return scanner.nextLine();
    }

    public String readOutputFile() {
        System.out.print("Результирующий Файл по умолчанию с результатами шифрования/дешифрования " + DEFAULT_OUTPUT_FILE + " (y/n): ");
        String useDefault = scanner.nextLine();
        if (useDefault.equalsIgnoreCase("y")) {
            return filePathBuilder.buildAbsolutePath(DEFAULT_OUTPUT_FILE);
        }
        System.out.print("Введите абсолютный путь к файлу для вывода результатов: ");
        return scanner.nextLine();
    }

    public int readKey() {
        System.out.print("Введите числовой ключ (положительное значение): ");
        while (true) {
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (Exception e) {
                System.out.print("Введённое значение ключа не корректно. Попробуйте еще раз: ");
            }
        }
    }
}
