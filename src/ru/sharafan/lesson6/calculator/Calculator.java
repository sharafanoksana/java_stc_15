package ru.sharafan.lesson6.calculator;

import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);


    public static double getNum1()
    {
        return scanner.nextDouble();
    }

    public static double getNum2()
    {
        return scanner.nextDouble();
    }

    public static char getOperationMark()
    {
        return scanner.next().charAt(0);
    }

    public static double giveResult(double num1, double num2, char operationMark)
    {
        Double result = null;

        switch (operationMark)
        {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = (num1 / 100) * num2;
                break;
        }
        return result.doubleValue();
    }

    public static void startCalculator()
    {
        double num1 = getNum1();
        char mark = getOperationMark();
        double num2 = getNum2();

        System.out.println("= " + Calculator.giveResult(num1, num2, mark));
    }
}
