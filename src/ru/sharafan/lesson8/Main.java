package ru.sharafan.lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg)
    {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String myString = s.replaceAll("бяка", "вырезано цензурой");
        System.out.println(myString);

        String s1 = "A это бяка закаляка кусачая, я сама ее выдумала!";
        System.out.println(s1);
        String s2 = s1.replaceAll("бяка", "ВЫРЕЗАНО ЦЕНЗУРОЙ");
        System.out.println(s2);
    }
}
