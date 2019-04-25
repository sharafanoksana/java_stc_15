package ru.sharafan.lesson5.vendingMachine.drink;

public class Drink {
    private String nameDrink;
    private double costDrink;
    protected int size;

    protected Drink(String nameDrink, double costDrink, int sizeDrink)
    {
        this.nameDrink = nameDrink;
        this.costDrink = costDrink;
        this.size = sizeDrink;
    }

    public String getNameDrink()
    {
        return nameDrink;
    }

    public double getCostDrink()
    {
        return costDrink;
    }

    public int getSize()
    {
        return size;
    }
}
