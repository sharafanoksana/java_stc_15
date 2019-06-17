package ru.sharafan.lesson21.lesson21_2.products;

import java.util.Objects;

public abstract class Product {
    private String name;
    private double price;
//    private Integer id;

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

//    public Integer getId()
//    {
//        return id;
//    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && name.equals(product.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, price);
    }

    @Override
    public String toString()
    {
        return "\n\nProduct{" + "'" + name + '\'' + ", \t цена: \t" + price + '}' + "\n";
    }
}
