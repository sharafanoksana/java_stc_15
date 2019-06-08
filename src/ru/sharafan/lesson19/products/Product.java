package ru.sharafan.lesson19.products;

public class Product {
    private String name;
    private double price;
    private String id;

    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getId()
    {
        return id;
    }

    @Override
    public String toString()
    {
        return "Product{" + "'" + name + '\'' + ", \t цена: \t" + price + '}' + "\n";
    }
}
