package ru.sharafan.lesson2.hotColdGame;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Задача 4*: Игра  «Горячо-Холодно»
 */
public class HotColdGameProcessor {

    /**
     * Генерация рандомного числа от 0 до 100
     *
     * @return int
     */
    private static int getRandomValue()
    {
        int a = 0; // задаем нижний диапазон
        int b = 100; // задаем верхний диапазон
        return a + (int) (Math.random() * b); // возращает сгенерированное число
    }

    /**
     * Игра горячо-холодно
     */
    public static void doGame()
    {
        Scanner scanner = new Scanner(System.in);
        int random = getRandomValue();
        //System.out.println(random); // раскоментируйте, чтоб увидеть рандомное число
        int beforeNumber = 0; // начальная точка для сравнения пользовательского числа
        while (true)
        {
            System.out.print("Угадайте задуманное число от 0 до 100  - ");
            int userNumber = scanner.nextInt(); // предполагаемое число пользователя
            if (userNumber == random)
            {
                System.out.println("Поздравляем!!! Вы угадали!!!");
                break;
            }
            else if (abs(random - beforeNumber) >= abs(random - userNumber))
            {
                System.out.println("Горячо!!! Попробуйте еще раз - ");
                beforeNumber = userNumber;

            }
            else
            {
                System.out.println("Холодно!!! Попробуйте еще раз - ");
            }
        }
        System.out.println("________________________________________");//разделитель заданий

    }

}
