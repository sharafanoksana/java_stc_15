package ru.sharafan.lesson7.animals;

import ru.sharafan.lesson7.interfaces.Flayable;

public class Swallow extends Animal implements Flayable {
    private String name;

    public Swallow(String name)
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
        System.out.println("Я виртуозно летаю");
    }

    @Override
    public void aboutMe()
    {
        System.out.println(getName());
        fly();
    }
}
