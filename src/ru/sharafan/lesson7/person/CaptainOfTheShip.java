package ru.sharafan.lesson7.person;

public class CaptainOfTheShip extends Person {
    private String typeOfOccupation;

    public CaptainOfTheShip(String typeOfOccupation)
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
        System.out.println("Мой бег вызывает панику!");
    }

    @Override
    public void swim()
    {
        System.out.println("Я плаваю на корабле");
    }
}
