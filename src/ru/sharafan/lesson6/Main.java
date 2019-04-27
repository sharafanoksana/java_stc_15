package ru.sharafan.lesson6;

import ru.sharafan.lesson6.documents.Act;
import ru.sharafan.lesson6.documents.Contract;
import ru.sharafan.lesson6.documents.Converter;

public class Main {


    public static void main(String[] args)
    {
        /**
         * Задача 1. Калькулятор
         */
        //       Calculator.startCalculator();


        /**
         * Задача 2. Счетчик создаваемыъ объетков конструктора класса CountOfMyObjects
         */
        //        CountOfMyObjects.makeAnObjects();
        //        System.out.printf("Вы создали %d объектов класса CountOfMyObjects\n", CountOfMyObjects.getCount());


        /**
         * Задача 3. Конвертирование Договора в АКТ
         */
        Contract myFirstContract = new Contract("Максим", "Оксана");
        myFirstContract.addProduct("Работа 1");
        myFirstContract.addProduct("Работа 2");
        myFirstContract.addProduct("Работа 3");
        myFirstContract.printContract();

        System.out.println("__________________________________________");

        Converter processor = new Converter(myFirstContract);
        Act result = processor.doConvert();
        result.printAct();


    }

}
