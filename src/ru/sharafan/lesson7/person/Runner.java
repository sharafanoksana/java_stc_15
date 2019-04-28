package ru.sharafan.lesson7.person;

public class Runner extends Person {
    private String typeOfOccupation;

    public Runner(String typeOfOccupation)
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
        System.out.println("Я профессиональных бегун, могу бегать быстро и долго. Участвую в соревнованиях");
    }

    @Override
    public void swim()
    {
        System.out.println("Я не умею плавать профессионально");
    }
}
