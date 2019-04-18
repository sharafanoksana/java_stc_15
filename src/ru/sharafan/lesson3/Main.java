package ru.sharafan.lesson3;

import ru.sharafan.lesson3.test1.MinNumber;
import ru.sharafan.lesson3.test2.NumberCharacteristic;
import ru.sharafan.lesson3.test3.MultiplicationTable;
import ru.sharafan.lesson3.test4.MyProgression;
import ru.sharafan.lesson3.test5.InvertWord;

public class Main {

    public static void main(String[] args)
    {
        /**
         * Задача 1: Минимальное чило из двух
         */
        MinNumber.chooseMin();
        System.out.println("________________________________________");//разделитель заданий

        /**
         * Задача 2: Характеристика числа
         */
        NumberCharacteristic.describeNum();
        System.out.println("________________________________________");//разделитель заданий

        /**
         * Задача 3: Табица уножения
         */
        MultiplicationTable.doTable();
        System.out.println("________________________________________");//разделитель заданий

        /**
         * Задача 4: Программа для вывода арифметической или геометричесой прогрессии для N чисел.
         */
        MyProgression.doProgression();
        System.out.println("________________________________________");//разделитель заданий

        /**
         * Задача 5: Инвертировать строку
         */
        InvertWord.doInvert();

    }

}
