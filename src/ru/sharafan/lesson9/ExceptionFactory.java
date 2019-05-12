package ru.sharafan.lesson9;

public class ExceptionFactory {

    /**
     * попытка присвоения значения null примитивному типу — ошибка времени компиляции
     */
    public void doNullPointerExceptionOneCase() throws NullPointerException
    {
        Integer myInteger = null;
        int myInt = myInteger;
        System.out.println("Ссылка на пустой объект" + myInt);
    }

    /**
     * попытка использовать неинициализированную локальную переменную
     */
    public void doNullPointerExceptionTwoCase() throws NullPointerException
    {
        Object myObject = null;
        System.out.println(myObject.toString());
    }

    public void doArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException
    {
        int[] myArray = {1, 2};
        System.out.println("Неверный индекс" + myArray[2]);
    }

    public void doMyException() throws MyException
    {
        throw new MyException();
    }
}
