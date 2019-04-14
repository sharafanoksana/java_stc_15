package ru.sharafan.lesson2.salary;

import java.util.Locale;
import java.util.Scanner;

public class SalaryCalc {
    /**
     * расчет заработной платы
     *
     * @param dirtySalary зарплата до вычета НДФЛ
     * @return double зарплата на руки с вычетом НДФЛ
     */
    public static double calcSalary(double dirtySalary) {
        return dirtySalary - (dirtySalary * 0.13);
    }

    /**
     * Принимаем от пользователя размер заработно платы и выводим результат чистой зарплаты
     */
    public static void giveSalary() {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите размер зарaботной платы: ");
        double noNdflSalary = scanner.nextDouble();// Дробное число со разделительной точкой

        double resultSalary = SalaryCalc.calcSalary(noNdflSalary);

        System.out.println(String.format("К выплате за вычетом НДФЛ - %10.2f", resultSalary));
        System.out.println("________________________________________");//разделитель заданий
    }
}
