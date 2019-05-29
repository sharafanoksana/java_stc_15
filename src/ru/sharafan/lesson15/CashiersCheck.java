package ru.sharafan.lesson15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CashiersCheck {
    private String nameOfProduct;
    private Double price;
    private Double quantily;
    private Double cost;
    private String fileName;

    public CashiersCheck(String fileName)
    {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.quantily = quantily;
        this.cost = cost;
        this.fileName = fileName;
    }

    public void readCheck()
    {
        try (InputStream is = new FileInputStream(this.fileName))
        {
            byte[] buf = new byte[100];
            if (is.read(buf) != -1)
            {
                String s = new String(buf, "UTF-8");
                System.out.println(s);
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}