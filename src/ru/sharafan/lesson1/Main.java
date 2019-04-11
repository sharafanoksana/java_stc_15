package ru.sharafan.lesson1;

import ru.sharafan.lesson1.fuelAmount.FuelCalc;
import ru.sharafan.lesson1.salary.SalaryCalc;
import ru.sharafan.lesson1.timeConvert.TimeCalc;

public class Main {


    public static void main(String[] args) {

        /**
         * Задача 1: расчет стоимости чека на покупку бензина
         */
        double result = FuelCalc.calcCost(10, 60);
        System.out.println(result);

        /**
         * Задача 2: расчет зарплаты после вычета НДФЛ
         */
        double resultSalary = SalaryCalc.calcSalary(70000);
        System.out.println(resultSalary);

        /**
         * Задача 3: конвертирование секунд в часы
         */
        long resultHours = TimeCalc.secondsToHours(3600);
        System.out.println(resultHours);
    }
}
