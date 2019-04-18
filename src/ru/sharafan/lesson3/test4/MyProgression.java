package ru.sharafan.lesson3.test4;

import java.util.Scanner;
import static java.lang.Math.pow;

public class MyProgression {

    public static void doProgression()
    {
        System.out.println("РАСЧЕТ АРИФМЕТИЧЕСКОЙ ИЛИ ГЕОМЕТРИЧЕСКОЙ ПРОГРЕССИИ ДЛЯ ЧИЛА N");
        /**
         * Выбор варианта и расчет прогрессии
         */
        while (true)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Какую прогрессию вы хотите посчитать? \n арифметическая - нажмите (а);" + " \n " +
                    "" + "геометрическая - нажмите (b).");
            String myProgress = in.next();

            if (myProgress.equals("a"))
            {
                System.out.println("Введите число N для расчета арифметической прогрессии - ");
                double numN = in.nextInt();
                System.out.println("Введите число d (разность прогрессии) - ");
                double numD = in.nextInt();
                countArithmeticProgression(numN, numD);
                break;
            }
            else if (myProgress.equals("b"))
            {
                System.out.println("Введите число N для расчета геометрической прогрессии - ");
                double numN = in.nextInt();
                System.out.println("Введите число d (знаменатель прогрессии) - ");
                double numD = in.nextInt();
                countGeometricProgression(numN, numD);
                break;
            }
            else
            {
                System.out.println("Попробуйте еще раз ввести нужную букву");
            }
        }
    }

    /**
     * Расчет геометрической прогрессии по формуле resProgres = numN * numD ^ (i - 1);
     * @param numN - начальное число прогрессии
     * @param numD - знаменатель прогрессии
     */
    private static void countGeometricProgression(double numN, double numD)
    {
        for (double i = 0; i < 10; i++)
        {
            double numPov = i - 1; // расчет степени
            double resultPow = pow(numD, numPov); // расчет возведения D числа в степень
            double resProgres = numN * resultPow; // получение результата прогрессии
            System.out.printf("N (%.0f) * D (%.0f)  в степени (%2.0f)  равно = %15.2f  \n",
                    numN, numD, numPov, resProgres);
        }
    }

    /**
     * Расчет арифметической прогрессии по формуле num = numN + numD *(i - 1)
     * @param numN общий член числовой последовательности
     * @param numD разность арифметической прогрессии
     */
    private static void countArithmeticProgression(double numN, double numD)
    {
        for (double i = 0; i < 10; i++)
        {
            double num = numN + ((i - 1) * numD);
            System.out.printf(" %10.0f \n", num);
        }
    }
}
