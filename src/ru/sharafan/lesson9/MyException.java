package ru.sharafan.lesson9;

public class MyException extends Exception {
    @Override
    public String getMessage()
    {
        return "Not correct";
    }
}
