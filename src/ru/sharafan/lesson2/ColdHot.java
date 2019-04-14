package ru.sharafan.lesson2;

import javafx.application.Application;
import javafx.stage.Stage;

public class ColdHot {

    public static int coldHot() {

        int a = 0;
        int b = 100;
        int randomNumber = a + (int)(Math.random()*b); // генерация рандомного числа
        return randomNumber;


    }
}
