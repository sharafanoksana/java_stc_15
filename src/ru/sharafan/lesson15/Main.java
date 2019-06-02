package ru.sharafan.lesson15;

public class Main {
    public static void main(String[] args)
    {
//        Double a = Double.parseDouble("0.315");
//        int asd=0;

        Check check = new Check("src\\ru\\sharafan\\lesson15\\products.txt");
        check.readCheck();
        check.write("src\\ru\\sharafan\\lesson15\\check.txt");

    }
}
