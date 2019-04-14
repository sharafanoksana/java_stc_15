package ru.sharafan.lesson2;

import ru.sharafan.lesson2.timeConvert.TimeCalc;
import ru.sharafan.lesson2.salary.SalaryCalc;
import ru.sharafan.lesson2.fuelAmount.FuelCalc;
import ru.sharafan.lesson2.hotColdGame.HotColdGameProcessor;

public class Main {

    public static void main(String[] args) {

        /**
         * Задача 4*: Игра  «Горячо-Холодно»
         */
        HotColdGameProcessor.doGame();

        /**
         * Задача 1: расчет стоимости чека на покупку бензина
         */
        FuelCalc.doCount();


        /**
         * Задача 2: расчет зарплаты после вычета НДФЛ
         */
        SalaryCalc.giveSalary();

        /**
         * Задача 3: конвертирование секунд в часы
         */
        TimeCalc.giveHours();
    }
}
