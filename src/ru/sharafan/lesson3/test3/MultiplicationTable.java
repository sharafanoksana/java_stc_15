package ru.sharafan.lesson3.test3;

import java.util.Scanner;

public class MultiplicationTable {
    /**
     * Таблица умножения от 1 до 10
     */
    public static void doTable()
    {
        System.out.println("ТАБЛИЦА УМНОЖЕНИЯ ОТ 1 ДО 10");
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                int result = i * j;
                System.out.printf("%3d * %2d = %3d     ", i, j, result);
            }
            System.out.println();
        }
    }
}
