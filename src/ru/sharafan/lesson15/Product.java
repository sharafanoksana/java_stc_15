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

//    private double doCount()
//    {
//        this.count = this.price * this.weight;
//        return this.count;
//    }

//    @Override
//    public String toString()
//    {
//        String s = String.format("%.15s %2$24.2d x%1$7.3d = %3$13.2d%n", this.name, this.price, this.weight, this.count);
//        return s;
//    }
}
