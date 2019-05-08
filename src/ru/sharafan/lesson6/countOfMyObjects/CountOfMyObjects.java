package ru.sharafan.lesson6.countOfMyObjects;

import java.util.Scanner;

public class CountOfMyObjects {
    static int count;
    int n;

    public CountOfMyObjects()
    {
        count++;
        System.out.println(count);
    }


    public static int getCount()
    {
        return count++;
    }

    public static void makeAnObjects()
    {
        System.out.println("Cколько объектов вы хотите создать? ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            new CountOfMyObjects();
        }
    }
}
