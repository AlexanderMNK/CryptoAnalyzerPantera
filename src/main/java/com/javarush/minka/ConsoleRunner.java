package com.javarush.minka;

public class ConsoleRunner {

    public static void main(String[] args) {
        //  Это мой первый проект, поэтому приношу свои извинения
        //  всякому, кто увидит этот код(юмор, если что).
        //  Обилие комментариев обосновано тем, что мне так легче
        //  концентрироваться на конкретной цели.

//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
        char[] alpha = Alphabet.chars;
        System.out.println(alpha);

        // Создание меню.

        Application application = new Application();
        application.run(null);
    }
}