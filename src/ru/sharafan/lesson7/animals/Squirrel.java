package ru.sharafan.lesson7.animals;

import ru.sharafan.lesson7.interfaces.Flayable;

public class Squirrel extends Animal implements Runnable, Flayable {
    private String name;

    public Squirrel(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public void run()
    {
        System.out.println("Я прыгаю по деревьям. ");
    }

    @Override
    public void fly()
    {
        System.out.println("Я планирую в прыжке с ветки на ветку! ");
    }

    @Override
    public void aboutMe()
    {
        System.out.println(getName());
        run();
        fly();
    }
}
