package ru.sharafan.lesson7;

import ru.sharafan.lesson7.animals.*;
import ru.sharafan.lesson7.person.CaptainOfTheShip;
import ru.sharafan.lesson7.person.InnopolisResident;
import ru.sharafan.lesson7.person.Runner;
import ru.sharafan.lesson7.person.Swimmer;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        /**
         * Задание 1 - 2
         */
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите желаемое количество животных");
        int countAnimals = scanner.nextInt();

        for (int i = 0; i < countAnimals; i++)
        {
            int r = random.nextInt(5) + 1;
            switch (r)
            {
                case 1:
                    animals.add(0, new Duck("Утка"));
                    break;
                case 2:
                    animals.add(new Dog("Собака"));
                    break;
                case 3:
                    animals.add(new Dolphin("Дельфин"));
                    break;
                case 4:
                    animals.add(new Swallow("Ласточка"));
                    break;
                case 5:
                    animals.add(new Squirrel("Белка"));
                    break;
            }
        }

        for (int j = 0; j < animals.size(); j++)
        {
            Animal oneAnimal= animals.get(j);
            oneAnimal.aboutMe();
            System.out.println();
        }
        System.out.println("________________________________");

         /**
         * Задание 3
         */
        Swimmer swimmer = new Swimmer("Плавец");
        System.out.println(swimmer.getTypeOfOccupation());
        swimmer.swim();
        swimmer.run();

        System.out.println("________________________________");

        Runner runner = new Runner("Бегун");
        System.out.println(runner.getTypeOfOccupation());
        runner.run();
        runner.swim();

        System.out.println("________________________________");

        CaptainOfTheShip captainOfTheShip = new CaptainOfTheShip("Капитан коробля");
        System.out.println(captainOfTheShip.getTypeOfOccupation());
        captainOfTheShip.run();
        captainOfTheShip.swim();

        System.out.println("________________________________");

        InnopolisResident innopolisResident = new InnopolisResident("Житель Иннополиса");
        System.out.println(innopolisResident.getTypeOfOccupation());
        innopolisResident.run();
        innopolisResident.swim();

        System.out.println("________________________________");

    }
}
