package ru.sharafan.lesson10;

public class BadFoodException extends Exception {
    private Food food;

    public BadFoodException(Food food)
    {
        this.food = food;
    }

    @Override
    public String getMessage()
    {
         return ("<Ребенок>: Я НЕ люблю " + this.food + "!") ;
    }
}
