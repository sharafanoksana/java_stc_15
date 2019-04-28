package ru.sharafan.lesson7.person;

public class InnopolisResident extends Person {
    private String typeOfOccupation;

    public InnopolisResident(String typeOfOccupation)
    {
        this.typeOfOccupation = typeOfOccupation;
    }

    @Override
    public String getTypeOfOccupation()
    {
        return this.typeOfOccupation;
    }

    @Override
    public void run()
    {
        System.out.println("Я бегу за шатлом)). Всегда на него опаздываю =)!");
    }

    @Override
    public void swim()
    {
        System.out.println("Я плаваю в бассейне.");
    }
}
