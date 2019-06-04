package ru.sharafan.lesson15;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private double weight;
    private double price;

    public double getAmount()
    {
        return this.price * this.weight;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getWeight()
    {
        return this.weight;
    }

    public void setWeight(String weight)
    {
        if (weight != null)
        {
            this.weight = Double.parseDouble(weight);
        }
    }

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(String price)
    {
        if (price != null)
        {
            this.price = Double.parseDouble(price);
        }
    }
}
