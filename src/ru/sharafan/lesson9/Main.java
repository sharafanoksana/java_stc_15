package ru.sharafan.lesson9;

public class Main {
    public static void main(String[] args)
    {
        ExceptionFactory factory = new ExceptionFactory();
        try
        {
            factory.doNullPointerExceptionOneCase();
        }catch (NullPointerException e){
            System.out.printf("Ссылка на пустой объект %s \n", e.getMessage());
        }

        try
        {
            factory.doNullPointerExceptionTwoCase();
        }catch (NullPointerException e){
            System.out.printf("Попытка использовать неинициализированную локальную переменную %s \n", e.hashCode());
        }

        try
        {
            factory.doArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("Выход за границы массива по индексу - %s \n", e.getMessage());
        }

        try
        {
            factory.doMyException();
        }catch (MyException e){
            System.out.printf("%s %d", e.getMessage(), e.hashCode());
        }
    }
}
