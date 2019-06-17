package ru.sharafan.lesson21.lesson21_1;

import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args)
    {
        Person person1 = new Person("Вася", "Иванов");
        Person person2 = new Person("Петр", "Петров");
        Person person3 = new Person("Виктор", "Викторов");
        Person person4 = new Person("Сергей", "Савельев");
        Person person5 = new Person("Вадим", "Викторов");

        Map<String, String> mapPerson = new HashMap<>();
        mapPerson.put(person1.getName(), person1.getSurname());
        mapPerson.put(person2.getName(), person2.getSurname());
        mapPerson.put(person3.getName(), person3.getSurname());
        mapPerson.put(person4.getName(), person4.getSurname());
        mapPerson.put(person5.getName(), person5.getSurname());

        Filter filter = new Filter();
        boolean chek = filter.isUnique(mapPerson);
        System.out.println(chek);
    }
}
