package ru.sharafan.lesson19;

import ru.sharafan.lesson19.products.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Basket basket = new Basket();

        ArrayList<Product> groceryStoreList = new ArrayList<>();

        System.out.println("Список товаров в магазине:");
        groceryStoreList.add(0, new Milk());
        groceryStoreList.add(1, new Apples());
        groceryStoreList.add(2, new Bananas());
        groceryStoreList.add(3, new Bow());
        groceryStoreList.add(4, new Bread());
        groceryStoreList.add(5, new Butter());
        groceryStoreList.add(6, new Carrot());
        groceryStoreList.add(7, new Cheese());
        groceryStoreList.add(8, new Cucumbers());
        groceryStoreList.add(9, new Eggs());
        groceryStoreList.add(10, new Fish());
        groceryStoreList.add(11, new Meat());
        groceryStoreList.add(12, new Oranges());
        groceryStoreList.add(13, new Potatoes());
        groceryStoreList.add(14, new Sausage());
        groceryStoreList.add(15, new Tomatoes());
        groceryStoreList.add(16, new Yogurt());
        System.out.print(groceryStoreList.toString() + "\n");

        System.out.println("Добавление товара в корзину:");
        basket.addProduct(groceryStoreList.get(0), 2);
        basket.addProduct(groceryStoreList.get(3), 2);
        basket.addProduct(groceryStoreList.get(4), 5);
        basket.addProduct(groceryStoreList.get(1), 2);
        basket.addProduct(groceryStoreList.get(9), 3);
        basket.addProduct(groceryStoreList.get(14), 3);
        basket.addProduct(groceryStoreList.get(15), 2);
        basket.addProduct(groceryStoreList.get(8), 1);
        basket.addProduct(groceryStoreList.get(10), 1);
        System.out.println(basket.getProducts());
        printBasket(basket);

        Product deleting = groceryStoreList.get(9); // вид продукта для удаления
        System.out.println("Удаление одного продукта: " + deleting.getName() + ", из корзины");
        basket.removeProduct(deleting);
        System.out.println(basket.getProducts());
        printBasket(basket);

        Product counted = groceryStoreList.get(14); // вид продукта для подчета его количества в корзине
        int count = basket.getProductQuantity(counted); //количество однотипных продуктов в корзине
        System.out.println("Количество одного типа товаров в корзине " + counted.getName() + ": " + count);

        int quantity = 3; //количество удаляемых продуктов
        Product deletingSeveral = groceryStoreList.get(4); // вид продукта для удаления
        System.out.println("Удаление из корзины продукта: " + deletingSeveral.getName() + " в количестве: " + quantity);
        basket.updateProductQuantity(deletingSeveral, quantity);
        System.out.println(basket.getProducts());
        printBasket(basket);

        System.out.println("Очистка корзины от продуктов");
        basket.clear();
        System.out.println(basket.getProducts());
        printBasket(basket);
    }

    public static void printBasket(Basket basket){
        System.out.println("Всего продуктов в корзине: " + basket.getCountAllProduct() + "\n");
    }
}
