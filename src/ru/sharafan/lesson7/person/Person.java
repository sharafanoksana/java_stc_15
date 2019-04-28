package ru.sharafan.lesson7.person;

import ru.sharafan.lesson7.interfaces.Swimable;

public abstract class Person implements Runnable, Swimable {
    protected String typeOfOccupation;

    public abstract String getTypeOfOccupation();
}
