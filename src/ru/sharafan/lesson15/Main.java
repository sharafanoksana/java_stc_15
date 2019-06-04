package ru.sharafan.lesson15;

public class Main {
    public static void main(String[] args)
    {
        Check check = new Check("src\\ru\\sharafan\\lesson15\\products.txt");
        check.readCheck();
        check.write("src\\ru\\sharafan\\lesson15\\check.txt");
    }
}
