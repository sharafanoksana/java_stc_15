package ru.sharafan.lesson21.lesson21_2;

import ru.sharafan.lesson21.lesson21_2.products.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        Basket basket = new Basket();

        Map<Integer, Product> groceryStoreListMap = new HashMap<Integer, Product>();

        System.out.println("Список товаров в магазине:");
        groceryStoreListMap.put(0, new Milk());
        groceryStoreListMap.put(1, new Apples());
        groceryStoreListMap.put(2, new Bananas());
        groceryStoreListMap.put(3, new Bow());
        groceryStoreListMap.put(4, new Bread());
        groceryStoreListMap.put(5, new Butter());
        groceryStoreListMap.put(6, new Carrot());
        groceryStoreListMap.put(7, new Cheese());
        groceryStoreListMap.put(8, new Cucumbers());
        groceryStoreListMap.put(9, new Eggs());
        groceryStoreListMap.put(10, new Fish());
        groceryStoreListMap.put(11, new Meat());
        groceryStoreListMap.put(12, new Oranges());
        groceryStoreListMap.put(13, new Potatoes());
        groceryStoreListMap.put(14, new Sausage());
        groceryStoreListMap.put(15, new Tomatoes());
        groceryStoreListMap.put(16, new Yogurt());
        groceryStoreListMap.put(17, new Apples());
        System.out.print(groceryStoreListMap.toString() + "\n");


        System.out.println("Добавление товара в корзину:");
        basket.addProduct(groceryStoreListMap.get(0), 1);
        basket.addProduct(groceryStoreListMap.get(1), 4);
        basket.addProduct(groceryStoreListMap.get(2), 3);
        basket.addProduct(groceryStoreListMap.get(1), 3);
        basket.addProduct(groceryStoreListMap.get(9), 3);

        System.out.println(basket.getProducts());
        printBasket(basket);

        Product deleting = groceryStoreListMap.get(0); // вид продукта для удаления
        System.out.println("Удаление одного продукта: " + deleting.getName() + ", из корзины");
        basket.removeProduct(deleting);
        System.out.println(basket.getProducts());
        printBasket(basket);

        Product counted = groceryStoreListMap.get(9); // вид продукта для подчета его количества в корзине
        int count = basket.getProductQuantity(counted); //количество однотипных продуктов в корзине
        System.out.println("Количество одного типа товаров в корзине " + counted.getName() + ": " + count);

        int quantity = 3; //количество удаляемых продуктов
        Product deletingSeveral = groceryStoreListMap.get(1); // вид продукта для удаления
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
