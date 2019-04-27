package ru.sharafan.lesson6.documents;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Act {
    private static int counter = 1;
    private int number;
    private Date date;
    private ArrayList<String> completeWorkList;
    private String customer;
    private String executor;

    public Act(String customer, String executor)
    {
        this.customer = customer;
        this.executor = executor;
    }

    public Act()
    {
        this.completeWorkList = new ArrayList<String>();
        this.date = new Date();
        this.number = counter++;
    }

    public void setCustomer(String customer)
    {
        this.customer = customer;
    }

    public void setExecutor(String executor)
    {
        this.executor = executor;
    }

    public void setCompleteWorkList(ArrayList<String> list)
    {
        this.completeWorkList = list;
    }

    public void printAct()
    {
        SimpleDateFormat formatThisDateAct = new SimpleDateFormat("d MMM yyyy HH:mm:ss Z");
        System.out.printf("АКТ № %d\n", this.number);
        System.out.println("от " + formatThisDateAct.format(this.date));
        System.out.printf("Исполнитель - %s, ", executor);
        System.out.printf("произвел следующие %d работы: \n", this.completeWorkList.size());
        for (String work : this.completeWorkList)
        {
            System.out.println(" - " + work);
        }
        System.out.printf("Работы принял Заказчик - %s \n", customer);
    }
}
