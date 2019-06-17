package ru.sharafan.lesson21.lesson21_2;

import ru.sharafan.lesson21.lesson21_2.products.Product;

import java.util.List;

public interface Basketable
{
    void addProduct(Product product, int quantity);

    void removeProduct(Product product);

    void updateProductQuantity(Product product, int quantity);

    void clear();

    List<Product> getProducts();

    int getProductQuantity(Product product);
}
