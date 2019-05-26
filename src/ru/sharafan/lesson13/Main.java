package ru.sharafan.lesson13;

import java.io.IOException;

public class Main {
    private static final String fileLibrary = "Library_Of_Boiks.bin";

    public static void main(String[] args) throws IOException
    {

        Library library = new Library();
 //       library.printAll();

//        library.printAll();
//        library.saveBooks();
//        library.printAll();

//        library.addBook(new Book("Анна Каренина", "Л.Н.Толстой", 2010, 837));
//        library.saveBooks();

        library.printAll();
        library.addBook(new Book("Анна Каренина", "Л.Н.Толстой", 2010, 837));
        library.saveBooks();
        library.printAll();
        library.addBook(new Book("Война и мир", "Л.Н.Толстой", 2000, 3040));
        library.addBook(new Book("Воскресенье", "Л.Н.Толстой", 2001, 653));
        library.saveBooks();
        library.printAll();


    }
}
