package ru.sharafan.lesson19;

import ru.sharafan.lesson19.products.Product;

import java.util.*;

public interface Basketable
{
    void addProduct(Product product, int quantity);

    void removeProduct(Product product);

    void updateProductQuantity(Product product, int quantity);

    void clear();

    List<Product> getProducts();

    int getProductQuantity(Product product);
}
