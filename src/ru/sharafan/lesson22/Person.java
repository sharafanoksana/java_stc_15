package ru.sharafan.lesson22;

import java.util.Objects;

public class Person {
    private int age;
    private String name;
    private String sex;

    public Person(int age, String name, String sex)
    {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return this.age == person.age && name.equals(person.name) && sex.equals(person.sex);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(age, name, sex);
    }

    @Override
    public String toString()
    {
        return "\n Person{" + "age=" + age + ", name='" + name + '\'' + ", sex='" + sex + '\'' + '}' + "\n";
    }
}
