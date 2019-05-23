package ru.sharafan.lesson5;



import ru.sharafan.lesson5.vendingMachine.VendingMachine;

public class Main {

    public static void main(String[] args){

        VendingMachine machine = new VendingMachine();
        machine.printMenu();
        machine.addMoney();
        machine.choiceDrink();
        machine.doProcess();
    }
}
