package ru.sharafan.lesson2.timeConvert;

import java.util.Locale;
import java.util.Scanner;

public class TimeCalc {
    /**
     * Пересчет секунд в часы
     *
     * @param seconds секунды
     * @return long пересчет секунд в часы
     */
    public static double doSecondsToHours(double seconds) {
        return seconds / 3600;
    }

    /**
     * Принимаем количество секунд от пользователя и выводим результат в количестве часов
     */
    public static void giveHours() {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите количество секунд: ");
        double seconds = scanner.nextDouble();

        double resultHours = TimeCalc.doSecondsToHours(seconds);

        System.out.println("Получаем количество часов " + resultHours);
        System.out.println("________________________________________");//разделитель заданий
    }
}
