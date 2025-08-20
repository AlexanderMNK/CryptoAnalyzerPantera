package com.javarush.minka;

import com.javarush.khmelov.controller.MainController;
import com.javarush.khmelov.view.console.ConsoleApp;
import com.javarush.khmelov.view.console.Menu;

import java.util.Scanner;

public class ConsoleRunner {

    public static void main(String[] args) {
        // 04:12
        // Осваиваю Git

        //build console app
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu(input);
        MainController mainController = new MainController();
        ConsoleApp application = new ConsoleApp(mainController, menu);
        //run console app
        application.run(args);
    }
}

