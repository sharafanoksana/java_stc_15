package ru.sharafan.lesson11;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainJul {
    private static final Logger logger = Logger.getLogger(MainJul.class.getName());

    public static void main(String[] args) throws FileNotFoundException
    {
        logger.log(Level.FINE, "Начало работы");
        try
        {
            doSome("значение");
        } catch (Exception e)
        {
            logger.log(Level.SEVERE, e.getMessage(), e);
        }
        System.out.println("Пока!");
        logger.fine("Программа завершена");
    }

    private static void doSome(String value)
    {
        logger.fine("Вызван метод doSome с параметром <" + value + ">");
        logger.warning("Сейчас будет ошибка!");
        throw new RuntimeException("Какая-то ошибка");
    }

}
