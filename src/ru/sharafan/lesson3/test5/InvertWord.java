package ru.sharafan.lesson3.test5;

import java.util.Scanner;

public class InvertWord {
    public static void doInvert()
    {
        System.out.println("СЛОВО НАОБОРОТ");
        System.out.println("Введите ваше слово - ");

        Scanner in = new Scanner(System.in);

        String myWord = in.nextLine();
        StringBuffer reverseWord = new StringBuffer(myWord);
        reverseWord.reverse();
        System.out.println(reverseWord);
    }
}
