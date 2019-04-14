package ru.sharafan.lesson2.fuelAmount;

import java.util.Locale;
import java.util.Scanner;

public class FuelCalc {

    /**
     * расчет стоимости купленного бензина
     *
     * @param price цена одного литра бензина
     * @param count количество литров
     * @return double
     */
    public static double calcCost(double price, double count) {
        return price * count;
    }

    /**
     * Принимаем от пользователя данные для расчета стоимости и выводим результат
     */
    public static void doCount() {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите стоимость 1 л бензина - ");
        double price = scanner.nextDouble();// Дробное число со разделительной точкой

        System.out.print("Введите количество купленного бензина - ");
        double count = scanner.nextDouble();// Дробное число со разделительной точкой

        double result = calcCost(price, count);

        System.out.println(String.format("К оплате - %10.2f", result));
        System.out.println("________________________________________");//разделитель заданий
    }
}

