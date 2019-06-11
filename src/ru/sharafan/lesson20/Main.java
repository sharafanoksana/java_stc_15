package ru.sharafan.lesson20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("foo");
        stringSet.add("buzz");
        stringSet.add("bar");
        stringSet.add("fork");
        stringSet.add("bort");
        stringSet.add("spoon");
        stringSet.add("!");
        stringSet.add("dude");

        removeEvenLenght(stringSet);
        System.out.println(stringSet);
    }

    /**
     * Удаление из множества элементов строк елементы с четным количеством содержания символов
     * @param stringSet Список для обработки
     */
    private static void removeEvenLenght(Set<String> stringSet)
    {
        Iterator it = stringSet.iterator();
        while (it.hasNext())
        {
            String element = (String) it.next();
            if (element.length() % 2 != 0)
            {
                it.remove();
            }
        }
    }
}
