package ru.sharafan.lesson18;

import java.util.Comparator;

class PersonSuperComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2)
    {
        int compareName = person1.getName().compareTo(person2.getName());
        if (compareName == 0)
        {
            /**
             * Сравнение по возрасту
             */
            if (person1.getAge() > person2.getAge())
            {
                return 1;
            }
            else if (person1.getAge() < person2.getAge())
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }
        else {
            return compareName;
        }
    }
}
