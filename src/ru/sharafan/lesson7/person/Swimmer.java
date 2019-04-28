package ru.sharafan.lesson7.person;

public class Swimmer extends Person {
    private String typeOfOccupation;

    public Swimmer(String typeOfOccupation)
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
        System.out.println("Я профессиональный плавец и плаваю различными стилями как в бассейне," +
                " таи и на открытой воде. Участвую в соревнованиях");
    }

    @Override
    public void swim()
    {
        System.out.println("Бегаю на тренировках");
    }
}
