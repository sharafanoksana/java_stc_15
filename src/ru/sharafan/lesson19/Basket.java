package ru.sharafan.lesson19;

import ru.sharafan.lesson19.products.Product;

import java.util.List;
import java.util.ArrayList;

public class Basket implements Basketable {

    ArrayList<Product> listProducts = new ArrayList<>();

    /**
     * Добавление в корзину продуктов
     *
     * @param product вид продукта
     * @param quantity количество продукта
     */
    @Override
    public void addProduct(Product product, int quantity)
    {
        for (int i = 0; i < quantity; i++)
        {
            this.listProducts.add(product);
        }
    }

    /**
     * Удаление из корзины одного продукта
     *
     * @param product
     */
    @Override
    public void removeProduct(Product product)
    {
        this.listProducts.remove(product);
    }

    /**
     * Удаление из корзины определенного вида продуктов
     *
     * @param product определенный вид продукта
     * @param quantity количество этого продукта в корзине
     */
    @Override
    public void updateProductQuantity(Product product, int quantity)
    {
        for (int i = 0; i < quantity; i++)
        {
            listProducts.remove(product);
        }
    }

    /**
     * Удалить все из корзины
     */
    @Override
    public void clear()
    {
        this.listProducts.removeAll(listProducts);
    }

    /**
     * Список продуктов в корзине
     * @return
     */
    @Override
    public List<Product> getProducts()
    {
        return this.listProducts;
    }

    /**
     * Количество определенного продукта корзине
     *
     * @param product определенный продукт
     * @return количество продуктов одного вида
     */
    @Override
    public int getProductQuantity(Product product)
    {
        int count = 0;
        for (Product item : this.listProducts)
        {
            if (item.getName() == product.getName())
            {
                count++;
            }
        }
        return count;
    }

    /**
     * Всего количество продуктов в корзине
     *
     * @return количество продуктов в корзине
     */
    public int getCountAllProduct()
    {
        return this.listProducts.size();
    }
}
