package ru.sharafan.lesson6;

public class Main {
    static int count = 0;
    public static void main(String[] args)
    {

        int i = 0;
        count = count + i;
        Calculator myCalc = new Calculator();

        i = count;
        for (i = 0;;i++)
        {
            myCalc.getNum1();
            myCalc.getOperationMark();
            myCalc.getNum2();
            System.out.println("= " + myCalc.giveResalt());


        }
    }
}
