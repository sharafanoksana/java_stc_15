package ru.sharafan.lesson3.test1;

import java.util.Scanner;

public class MinNumber {

    public static void chooseMin()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("ВЫБОР МИНИМАЛЬНОГО ЧИСЛА ИЗ ДВУХ ЧИСЕЛ");
        System.out.print("Введите первое число - ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число - ");
        int num2 = in.nextInt();

        if (num1 < num2)
        {
            System.out.println("Минимальное число - " + num1);
        }
        else if (num1 > num2)
        {
            System.out.println("Минимальное число - " + num2);
        }
        else
        {
            System.out.println("Числа равны");
        }
    }
}
