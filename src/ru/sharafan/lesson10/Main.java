package ru.sharafan.lesson10;

enum Food {
    APPLE, CARROT, PORRIDGE, PASTA, SAUSAGES, SOUP, TOMATO, CAKE, SALAD, WATERMELON, PEACH;
}

public class Main {
    public static void main(String[] args)
    {
        Mother mother = new Mother();
        for (int i = 0; i < 20; i++)
        {
            mother.toFeed();
            System.out.println();
        }
    }
}



