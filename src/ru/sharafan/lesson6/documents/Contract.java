package ru.sharafan.lesson6.documents;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Contract {
    private static int counter = 1;
    private int number;
    private String customer;
    private String executor;
    private Date date;
    private ArrayList<String> productList;


    public Contract(String customer, String executor)
    {
        this.number = counter;
        this.customer = customer;
        this.executor = executor;
        this.date = new Date();
        this.productList = new ArrayList<String>();
        counter++;
    }

    public ArrayList<String> getProductList()
    {
        return productList;
    }

    public void addProduct(String product)
    {
        this.productList.add(product);

    }

    public String getCustomer()
    {
        return customer;
    }

    public String getExecutor()
    {
        return executor;
    }

    public void printContract()
    {
        SimpleDateFormat formatThisDateContract = new SimpleDateFormat("d MMM yyyy HH:mm:ss Z");
        System.out.printf("Договор № %d\n", this.number);
        System.out.println("от " + formatThisDateContract.format(this.date));
        System.out.printf("Заказчик - %s \n", customer);
        System.out.printf("Исполнитель - %s, ", executor);
        System.out.printf("обязуется произвести следующие %d работы: \n", this.productList.size());
        for (String work : this.productList)
        {
            System.out.println(" - " + work);
        }
    }
}

