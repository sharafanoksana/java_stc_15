package ru.sharafan.lesson18;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args)
    {
        Comparator<Person> personComparator = new PersonSuperComparator();

        TreeSet<Person> list = new TreeSet(personComparator);
        list.add(new Person("Иванова ", 26));
        list.add(new Person("Луговая ", 20));
        list.add(new Person("Анисимов ", 45));
        list.add(new Person("Иванова ", 19));
        list.add(new Person("Климов ", 25));
        list.add(new Person("Соловьева ", 26));
        list.add(new Person("Юсупов ", 31));

        for (Person person: list){
            System.out.printf("Фамилия: %-15s %5d \n",person.getName(), person.getAge());
        }
    }
}
