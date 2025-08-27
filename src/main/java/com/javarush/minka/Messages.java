package com.javarush.minka;

public interface Messages {
    String INFO_ABOUT_PROGRAM = "Программа шифрования и дешифрования!";

    String HORIZON_SEPARATE = "-".repeat(25);
    String MESSAGE_SELECT_MODE = HORIZON_SEPARATE +
            "\u001b[32m" + "\nPlease select mode:\n" + "\u001b[32m" + """
            1. Encrypt
            2. Decrypt
            3. Exit
            """ + "\u001b[0m" + HORIZON_SEPARATE;
}