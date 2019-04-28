package ru.sharafan.lesson7.animals;

import ru.sharafan.lesson7.interfaces.Flayable;
import ru.sharafan.lesson7.interfaces.Runable;
import ru.sharafan.lesson7.interfaces.Swimable;

public class Duck extends Animal implements Flayable, Runable, Swimable {
    private String name;

    public Duck(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public void fly()
    {
        System.out.println("Я умею летать, кря!");
    }

    @Override
    public void run()
    {
        System.out.println("Я умею бегать в перевалку, кря-кря!");
    }

    @Override
    public void swim()
    {
        System.out.println("Я умею плавать и нырять, кряк!");
    }

    @Override
    public void aboutMe()
    {
        System.out.println(getName());
        fly();
        swim();
        run();
    }
}
