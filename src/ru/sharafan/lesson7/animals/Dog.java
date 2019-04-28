package ru.sharafan.lesson7.animals;

import ru.sharafan.lesson7.interfaces.Runable;
import ru.sharafan.lesson7.interfaces.Swimable;

public class Dog extends Animal implements Runable, Swimable {
    private String name;

    public Dog(String name)
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
        System.out.println("Я умею хорошо бегать, ррргав!");
    }

    @Override
    public void swim()
    {
        System.out.println("Я плаваю по-собачьи, гав!");
    }

    @Override
    public void aboutMe()
    {
        System.out.println(getName());
        run();
        swim();
    }
}
