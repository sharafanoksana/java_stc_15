package ru.sharafan.lesson3.test2;

import java.util.Scanner;

public class NumberCharacteristic {

    public static void describeNum()
    {
        System.out.println("ХАРАКТЕРИСТИКА ЧИСЛА");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число - ");

        int num = in.nextInt(); // ожидаемое число от пользователся

        describeSign(num);
        describePimeNum(num);
        describeEvenOdd(num);
    }

    /**
     * Описание числа положительное или отрицательное
     *
     * @param num принятый параметр от пользователся
     */
    private static void describeSign(int num)
    {
        if (num > 0)
        {
            System.out.print("Число положительное, ");
        }
        else if (num < 0)
        {
            System.out.print("Число отрицательное, ");
        }
        else
        {
            System.out.println("Число равно нулю");
        }
    }

    /**
     * Проверка на простое или сложное число
     *
     * @param num
     */
    private static void describePimeNum(int num)
    {
        if (num == 0)
        {
            return;
        }
        else if (num > 0 & ((num % 1 == 0) & (num % num == 0)))
        {
            System.out.print("натуральное, простое, ");
        }
        else if (num > 0 & ((num % 1 != 0) & (num % num != 0)))
        {
            System.out.print("натуральное, составное, ");
        }
        else
        {
            return;
        }
    }

    /**
     * Описание числа четное или нечетное
     *
     * @param num принятый параметр от пользователя
     */
    private static void describeEvenOdd(int num)
    {
        if (num == 0)
        {
            return;
        }
        if (num % 2 == 0)
        {
            System.out.println("четное");
        }
        else
        {
            System.out.println("нечетное");
        }
    }
}
