package ru.sharafan.lesson2;

import ru.sharafan.lesson2.fuelAmount.FuelCalc;
import ru.sharafan.lesson2.salary.SalaryCalc;
import ru.sharafan.lesson2.timeConvert.TimeCalc;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        /**
         * Задача 4*: Игра  «Горячо-Холодно»
         */

        int random = ColdHot.coldHot();
        System.out.println(random);
        int beforeNumber = 0;
        while (true) {
            System.out.print("Угадайте задуманное число от 0 до 100  - ");
            int userNumber = scanner.nextInt(); // предполагаемое число пльзователя
            if(userNumber == random) {
                System.out.println("Поздравляем вы угадали!!!" );
                break;
            }
            else if (abs(random - beforeNumber) >= abs(random - userNumber)  ){
                System.out.println("Горячо!!! Попробуйте еще раз - ");
                beforeNumber = userNumber;
            }
            else {
                System.out.println("Холодно!!! Попробуйте еще раз - ");
            }
        }
        System.out.println("________________________________________");//разделитель заданий




        /**
         * Задача 1: расчет стоимости чека на покупку бензина
         */

        System.out.print("Введите стоимость 1 л бензина - ");
        double price = scanner.nextDouble();// Дробное число со разделительной точкой

        System.out.print("Введите количество купленного бензина - ");
        double count = scanner.nextDouble();// Дробное число со разделительной точкой

        double result = FuelCalc.calcCost(price, count);

        System.out.println(String.format("К оплате - %10.2f", result ));
        System.out.println("________________________________________");//разделитель заданий

        /**
         * Задача 2: расчет зарплаты после вычета НДФЛ
         */
        System.out.print("Введите размер зарaботной платы: ");
        double noNdflSalary = scanner.nextDouble();// Дробное число со разделительной точкой

        double resultSalary = SalaryCalc.calcSalary(noNdflSalary);

        System.out.println(String.format("К выплате за вычетом НДФЛ - %10.2f", resultSalary ));
        System.out.println("________________________________________");//разделитель заданий

        /**
         * Задача 3: конвертирование секунд в часы
         */
        System.out.println("Введите количество секунд: ");
        double seconds = scanner.nextDouble();

        double resultHours = TimeCalc.secondsToHours(seconds); // разобраться с логнгом и привести его к дабл

        System.out.println("Получаем количество часов " + resultHours);
        System.out.println("________________________________________");//разделитель заданий


    }
}
