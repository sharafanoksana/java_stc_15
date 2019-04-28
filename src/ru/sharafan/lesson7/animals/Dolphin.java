package ru.sharafan.lesson7.animals;

import ru.sharafan.lesson7.interfaces.Swimable;

public class Dolphin extends Animal implements Swimable {
    private String name;

    public Dolphin(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public void swim()
    {
        System.out.println("Я отличный плавец");
    }

    @Override
    public void aboutMe()
    {
        System.out.println(getName());
        swim();
    }
}
