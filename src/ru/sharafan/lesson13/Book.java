package ru.sharafan.lesson13;

import java.io.Serializable;

public class Book implements Serializable {
    static final long serialVersionUID = 42L;

    private String name;
    private String author;
    private int yearOfPublishing;
    private int numberOfPages;

    public Book(String name, String author, int yearOfPublishing, int numberOfPages)
    {
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public int getYearOfPublishing()
    {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing)
    {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages()
    {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString()
    {
        return "Книга {" + " название: \"" + name + "\""
                + "; автор - " + author
                + "; год издания:  " + yearOfPublishing + "г."
                + "; количество страниц: " + numberOfPages + "c.}";
    }
}

