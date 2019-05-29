package ru.sharafan.lesson15;

public class Main {
    public static void main(String[] args)
    {
        CashiersCheck cashiersCheck = new CashiersCheck("products.txt");
        cashiersCheck.readCheck();
    }
}
