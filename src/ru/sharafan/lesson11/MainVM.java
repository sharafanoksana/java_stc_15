package ru.sharafan.lesson11;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import ru.sharafan.lesson11.vendingMachine2.VendingMachine;

public class MainVM {
    private static final Logger logger = Logger.getLogger(MainVM.class);

    public static void main(String[] args) throws IndexOutOfBoundsException
    {
        VendingMachine machine = new VendingMachine();
        machine.printMenu();
        machine.addMoney();
        logger.log(Priority.INFO, "Начало проверки выбора напитка");
        try
        {
            machine.choiceDrink(logger);
        } catch (IndexOutOfBoundsException e)
        {
            logger.error(e.getMessage(), e);
        }
        logger.info("Выбор напитка завершен");
        machine.doProcess();
    }
}
