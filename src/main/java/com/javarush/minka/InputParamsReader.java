package com.javarush.minka;

import java.util.Scanner;

public class InputParamsReader {
    private final Scanner scanner;
    private final DefaultFilePathBuilder filePathBuilder;

    public InputParamsReader(Scanner scanner, DefaultFilePathBuilder filePathBuilder) {
        this.scanner = scanner;
        this.filePathBuilder = filePathBuilder;
    }

    public String readInputFile() {
        System.out.print("Использовать input.txt по умолчанию? (y/n): ");
        String useDefault = scanner.nextLine();
        if (useDefault.equalsIgnoreCase("y")) {
            return filePathBuilder.buildAbsolutePath("input.txt");
        }
        System.out.print("Введите абсолютный путь к входному файлу: ");
        return scanner.nextLine();
    }

    public String readOutputFile() {
        System.out.print("Использовать output.txt по умолчанию? (y/n): ");
        String useDefault = scanner.nextLine();
        if (useDefault.equalsIgnoreCase("y")) {
            return filePathBuilder.buildAbsolutePath("output.txt");
        }
        System.out.print("Введите абсолютный путь к выходному файлу: ");
        return scanner.nextLine();
    }

    public int readKey() {
        System.out.print("Введите числовой ключ: ");
        while (true) {
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (Exception e) {
                System.out.print("Некорректный ввод. Попробуйте еще раз: ");
            }
        }
    }
}
