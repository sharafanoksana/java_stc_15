package ru.sharafan.lesson15;

import java.io.*;
import java.util.ArrayList;
import java.util.Formatter;

public class Check implements Serializable {
    private String fileName;
    private ArrayList<Product> list;

    /**
     * Принимает полное имя файла для чтения из него текста чека
     * @param fileName
     */
    public Check(String fileName)
    {
        this.fileName = fileName;
        this.list = new ArrayList<Product>();
    }

    /**
     * Создание продукта и инициализация его полей
     * @param buffer
     * @return
     * @throws IOException
     */
    public Product getProduct(BufferedReader buffer) throws IOException
    {
        Product product = new Product();
        product.setName(buffer.readLine());
        product.setWeight(buffer.readLine());
        product.setPrice(buffer.readLine());
        return product;
    }

    /**
     * Чтение текстового файла с добавлением в списочный массив продуктов
     */
    public void readCheck()
    {
        try (BufferedReader buffer = new BufferedReader(new FileReader(this.fileName)))
        {
            while (true)
            {
                Product product = this.getProduct(buffer);
                if (product.getName() == null)
                {
                    break;
                }
                this.list.add(product);
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Запись отформатированных строк списочного массива продуктов в виде таблицы в файл
     * @param path принимает полное имя файла для записи в него чека
     */
    public void write(String path)
    {
        try (FileWriter writer = new FileWriter(path))
        {
            double total = 0;
            Formatter f = new Formatter();
            Formatter head = f.format("%-15s%9s%9s%14s\n", "Наименование", "Цена", "К-во", "Стоимость");
            String s = String.valueOf(head);
            writer.write(s);
            writer.write("===============================================\n");
            f.close();
            for (Product product : this.list)
            {
                Formatter f1 = new Formatter();
                String amount ="=" + f1.format("%.2f",product.getAmount());
                Formatter f2 = new Formatter();
                try (Formatter body = f2.format("%-15.15s %2$8.2f x%3$7.3f %4$13s%n",
                        product.getName(), product.getPrice(), product.getWeight(), amount))
                {
                    writer.write(String.valueOf(body));
                }
                f1.close();
                f2.close();
            }
            writer.write("===============================================\n");
            for (Product product : this.list)
            {
                total+=product.getAmount();
            }
            Formatter f1 = new Formatter();
            String strTotal ="=" + f1.format("%.2f",total);
            Formatter f3 = new Formatter();
            Formatter footer = f3.format("%-15.15s%32s%n", "Итого:", strTotal);
            writer.write(String.valueOf(footer));
            f1.close();
            f3.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}