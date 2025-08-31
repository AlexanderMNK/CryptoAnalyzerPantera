package com.javarush.minka;

import java.util.Scanner;

public class Menu {
    public int showMainMenu(Scanner scanner) {
        System.out.println("-".repeat(70) +
                "\u001b[32m" + "\nПрограмма шифрования и дешифрования файлов на основании шифра Цезаря.");
        System.out.println("\t1. Шифрование");
        System.out.println("\t2. Дешифрование");
        System.out.println("\t3. Выход");
        System.out.print("Выберите действие: " + "\u001b[0m\n" + "-".repeat(70) + "\n");
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (Exception e) {
            return -1;
        }
    }
}