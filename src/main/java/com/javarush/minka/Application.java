package com.javarush.minka;

public class Application implements Messages {
    public Application() {
        Application.InfoAboutProgram();
    }

    public static void InfoAboutProgram() {
        System.out.println(INFO_ABOUT_PROGRAM);
    }

    public void run(String[] args) {
        if (args == null)
            System.out.println(MESSAGE_SELECT_MODE);
    }
}
