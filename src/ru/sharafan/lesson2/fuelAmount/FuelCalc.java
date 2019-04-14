package ru.sharafan.lesson2.fuelAmount;

public class FuelCalc {

    /**
     * расчет стоимости купленного бензина
     * @param price цена одного литра бензина
     * @param count количество литров
     * @return double
     */
    public static double calcCost(double price, double count) {
        return price * count;
    }
}
