package ru.sharafan.lesson2.salary;

public class SalaryCalc {
    /**
     * расчет заработной платы
     * @param noNdflSalary зарплата до вычета НДФЛ
     * @return double зарплата на руки с вычетом НДФЛ
     */
    public static double calcSalary(double noNdflSalary)
    {
        return noNdflSalary - (noNdflSalary * 0.13);
    }
}
