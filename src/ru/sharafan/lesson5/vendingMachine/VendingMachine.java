package ru.sharafan.lesson5.vendingMachine;

import ru.sharafan.lesson5.vendingMachine.drink.*;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {

    private double money;
    private ArrayList<Drink> arrayOfDrinks;
    private int button;

    public VendingMachine()
    {
        this.money = 0;
        this.button = 0;
        this.arrayOfDrinks = new ArrayList<Drink>();
        arrayOfDrinks.add(new Espresso());
        arrayOfDrinks.add(new Cappuccino());
        arrayOfDrinks.add(new Latte());
        arrayOfDrinks.add(new Moccaccino());
        arrayOfDrinks.add(new Tia());
    }

    /**
     * Вывод меню напитков
     */
    public void printMenu()
    {
        System.out.println("Меню:");
        System.out.println("_______________________________________");
        System.out.printf("%3s %20s %14s\n", "Код", "Наименование", "Стоимость");
        System.out.println("_______________________________________");
        for (int i = 0; i < this.arrayOfDrinks.size(); i++)
        {
            Drink myDrink = this.arrayOfDrinks.get(i);
            System.out.printf("%3d %20s %11.2f p.\n", (i + 1), myDrink.getNameDrink(), myDrink.getCostDrink());
        }
        System.out.println("_______________________________________");
    }

    /**
     * Пополнение счета
     */
    public void addMoney()
    {
        System.out.println("Внесите деньги на счет: ");
        Scanner scanner = new Scanner(System.in);
        this.money += scanner.nextDouble();
        /**
         * scaner.close() - вызывает ошибку при последующих вызовах метода addMoney.
         * Так можно делать?
         */
        scanner = null;
    }

    /**
     * Проверка на правильнось ввода индекса напитка из меню
     */
    public void choiceDrink()
    {
        do
        {
            System.out.println("Выберите напиток: ");
            Scanner scanner = new Scanner(System.in);
            this.button = scanner.nextInt() - 1;
            if (this.button < 0 || this.button > this.arrayOfDrinks.size() - 1)
            {
                System.out.println("У нас нет такого напитка.");
                scanner = null;
            }
            else
            {
                break;
            }
        } while (true);
    }

    /**
     * Проверка на наличие средств на счету
     *
     * @return true
     */
    private boolean doVaidate()
    {
        Drink myD = this.arrayOfDrinks.get(this.button);
        do
        {
            System.out.println("Вы внесли на счет: " + this.money + " р.");

            if (this.money > 0 && this.money < myD.getCostDrink())
            {
                System.out.println("У вас недостаточно средств на счету.");
                addMoney();
            }
            else if (this.money == 0)
            {
                System.out.println("Вы не внесли средства на счет.");
                this.money = 0; // обнуление счета
                addMoney();
            }
            else if (this.money < 0)
            {
                System.out.println("Отрицательный баланс недопустим");
                this.money = 0; // обнуление счета
                addMoney();
            }
            else
            {
                return true;
            }
        } while (true);
    }

    /**
     * Процесса расчета и выдачи напитка
     */
    public void doProcess()
    {
        boolean isValide = this.doVaidate();
        if (isValide)
        {
            Drink myDrink = this.arrayOfDrinks.get(this.button);
            String myND = myDrink.getNameDrink();

            System.out.println("Возьмите свой напиток: " + myND);
            double change = this.money - myDrink.getCostDrink();
            if (change == 0)
            {
                this.money = 0; // обнуление счета
            }
            else
            {
                System.out.println("Возьмите сдачу: " + change + " p.");
                this.money = 0; // обнуление счета
            }
        }
    }
}
