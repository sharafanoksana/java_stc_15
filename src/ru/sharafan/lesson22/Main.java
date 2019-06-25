package ru.sharafan.lesson22;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Map book = createMap();
        System.out.println("Полный список: \n" + book);
        removeTheDuplicates(book); // по поиску дубликатов в исходной мапе, затем при нахождении дубликата удалить его из исходной мапы используя метод
        System.out.println("Отформатированный список: \n" + book);
    }


    private static Map createMap()
    {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29, "Петрова", "жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");

        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        return book;
    }

    private static void removeTheDuplicates(Map<String, Person> map)
    {
        // Поиск дубликатов методом перебора map
        ArrayList<Person> needToDelete = new ArrayList<>(); // Список дубликатов для удаления
        for (Map.Entry<String, Person> item : map.entrySet())
        {
            for (Map.Entry<String, Person> item1 : map.entrySet())
            {
                if ((item.getValue() == item1.getValue() && (item.getKey() != item1.getKey())))
                {
                    if (!needToDelete.contains(item.getValue()))
                    {
                        needToDelete.add(item.getValue());
                    }
                }
            }
        }

        // Извликаем из списка needToDelete  Person и передаем их для удаления в map
        for (Person needToDeletePerson : needToDelete)
        {
            removeItemFromMapByValue(map, needToDeletePerson);
        }
    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value)
    {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
            {
                map.remove(pair.getKey());
            }
        }
    }
}
