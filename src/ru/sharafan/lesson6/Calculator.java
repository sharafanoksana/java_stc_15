package ru.sharafan.lesson6;

import java.util.Scanner;

public class Calculator {
    private static double num1;
    private static double num2;
    private static char operationMark;
    private static double result;


    static Scanner scanner = new Scanner(System.in);

    public static double getNum1()
    {
        num1 = scanner.nextDouble();
        return num1;
    }

    public static double getNum2()
    {
        num2 = scanner.nextDouble();
        return num2;
    }

    public static char getOperationMark()
    {
        operationMark = scanner.next().charAt(0);
        return operationMark;
    }

    public static double giveResalt()
    {

        if (operationMark == '+')
        {
            result = num1 + num2;
            return result;
        }
        else if (operationMark == '-')
        {
            result = num1 - num2;
            return result;
        }
        else if (operationMark == '*')
        {
            result = num1 * num2;
            return result;
        }
        else if (operationMark == '/')
        {
            result = num1 / num2;
            return result;
        }
        else if (operationMark == '%')
        {
            result = (num1 / 100) * num2;
            return result;
        }
        else
        {
            return num1;
        }
    }

    public static double seveResalt()
    {
        return result = num1;
    }
}
