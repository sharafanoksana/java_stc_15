package ru.sharafan.lesson21.lesson21_1;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname)
    {
        this.surname = surname;
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return this.surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return surname.equals(person.surname);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }
}
