package ru.sharafan.lesson21.lesson21_2;

import ru.sharafan.lesson21.lesson21_2.products.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Basket implements Basketable {

    private HashMap<Product, Integer> listProducts = new HashMap<>();

    /**
     * Добавление в корзину продуктов
     *
     * @param product  вид продукта
     * @param quantity количество продукта
     */

    public void addProduct(Product product, int quantity)
    {
        if (this.listProducts.containsKey(product))
        {
            this.listProducts.put(product, this.listProducts.get(product) + (quantity));
        }
        else
        {
            this.listProducts.put(product, quantity);
        }
    }

    /**
     * Удаление из корзины одного продукта
     *
     * @param product
     */

    public void removeProduct(Product product)
    {
        if (this.listProducts.containsKey(product))
        {
            this.listProducts.put(product, this.listProducts.get(product) - 1);
        }
        else
        {
            this.listProducts.remove(product);
        }
    }

    /**
     * Удаление из корзины определенного вида продуктов
     *
     * @param product  определенный вид продукта
     * @param quantity количество этого продукта в корзине
     */

    public void updateProductQuantity(Product product, int quantity)
    {
        if (this.listProducts.get(product) > quantity)
        {
            this.listProducts.put(product, this.listProducts.get(product) - quantity);
        }
        else
        {
            this.listProducts.remove(product);
        }

    }

    /**
     * Удалить все из корзины
     */
    @Override
    public void clear()
    {
        this.listProducts.clear();
    }

    /**
     * Список продуктов в корзине
     *
     * @return
     */
    @Override
    public List<Product> getProducts()
    {
        List<Product> listOfProducts = new ArrayList(this.listProducts.entrySet());
        return listOfProducts;
    }

    /**
     * Количество определенного продукта корзине
     *
     * @param product определенный продукт
     * @return количество продуктов одного вида
     */

    public int getProductQuantity(Product product)
    {
        int count = this.listProducts.get(product);
        return count;
    }

    /**
     * Всего количество продуктов в корзине
     *
     * @return количество продуктов в корзине
     */
    public int getCountAllProduct()
    {
        int countProducts = 0;
        for (Map.Entry<Product, Integer> item : this.listProducts.entrySet())
        {
            countProducts = countProducts + item.getValue();
        }
        return countProducts;
    }
}
