package ru.sharafan.lesson13;

import java.io.*;
import java.util.ArrayList;

public class Library implements Serializable {
    private static final String fileLibrary = "Library_Of_Boiks.bin";
    private ArrayList<Book> books;

    /**
     * Инициализация библиотеки
     */
    public Library()
    {
        this.books = new ArrayList<Book>();
        try
        {
            this.loadBooks();
        } catch (FileNotFoundException e)
        {
            this.saveBooks();
        }
        catch (IOException e){
            System.out.println("Ошибка ввода/вывода. " + e.getMessage());
        }
    }

    /**
     * Добавление книги в спсиок (не в файл!)
     * @param book
     */
    public void addBook(Book book)
    {
        this.books.add(book);
    }

    /**
     * Cоздание и сохранение списка книг в файле fileLibrary
     */
    public void saveBooks()
    {
        try (ObjectOutputStream bookOutputStrim = new ObjectOutputStream(new FileOutputStream(fileLibrary, true)))
        {
            bookOutputStrim.writeObject(this.books);
        } catch (IOException e)
        {
            System.out.println("Ошибка при работе с потоком " + e.getMessage());
        }
    }

    /**
     * Загрузка в память списка книг из файла fileLibrary
     * @throws FileNotFoundException пробрасывается в конструктор и обрабатывается методом сохранения пустого списка
     */
    void loadBooks() throws IOException
    {
        try (ObjectInputStream bookInputStream = new ObjectInputStream(new FileInputStream(fileLibrary)))
        {
                this.books = (ArrayList<Book>) bookInputStream.readObject();
        } catch (ClassNotFoundException e)
        {
            System.out.println("Список не найден: " + e.getStackTrace());

        }
    }

    /**
     * Вывод списка книг и количество книг в библиотеке
     */
    public void printAll()
    {
        for (Book book: this.books)
        {
            System.out.println(book);
        }
        System.out.println("Количество книг в библиотеке: " + books.size());
    }
}
