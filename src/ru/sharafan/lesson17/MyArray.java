package ru.sharafan.lesson17;

import java.util.Random;

public class MyArray {
    int[][] numbers;
    private int size1;
    private int size2;

    /**
     * Конструктор
     *
     * @param size1 размер одномерного подмассива
     * @param size2 размер одномерного подмассива (строки)
     */
    public MyArray(int size1, int size2)
    {
        this.numbers = numbers;
        this.size1 = size1;
        this.size2 = size2;
    }

    /**
     * Создание двумерного массива с заполнением его рандомными числами
     */
    void createArray()
    {
        System.out.println("Неотсортироанный массив из рандомных чисел");
        Random random = new Random();
        numbers = new int[this.size1][this.size2];

        for (int i = 0; i < this.size1; i++)
        {
            for (int j = 0; j < this.size2; j++)
            {
                numbers[i][j] = random.nextInt(100);
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Формирование двумерного массива из отсортированнх строк
     */
    public void sortNumbers()
    {
        System.out.println("Отсортироанный массив");
        for (int[] row : this.numbers)
        {
            this.sortRow(row);
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Сортировка строки массива от меньшего к большему метододом вставки
     *
     * @param row массив строки из чисел
     */
    private void sortRow(int[] row)
    {
        /**
         * По очередности просматриваем все элементы массива row сравнивая посдедний с 1-м,2-м
         * и т.д., предполагая, что первый элемент минимльный
         */
        for (int i = 0; i < row.length; i++)
        {
            int min = row[i];
            int minI = i;
            /**
             * В оставшейся части массива pow ищем элемент, который меньше предположенного минимума
             */
            for (int j = i + 1; j < row.length; j++)
            {
                if (row[j] < min)
                {
                    min = row[j];
                    minI = j;
                }
            }
            /**
             * Если нашелся элемента массива, который меньше, чем на текущей позиции, меняем их местами
             */
            if (i != minI)
            {
                int temp = row[i];
                row[i] = row[minI];
                row[minI] = temp;
            }
            System.out.print(row[i] + " \t");
        }
    }

    /**
     * Формирование двумерного массива из сдвинутых строк
     */
    void toLeft()
    {
        createArray();
        sortNumbers();
        System.out.println("Сдвиг элементов массива влево на 1 шаг");
        for (int[] row : this.numbers)
        {
            this.toLeftRow(row);
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Формирование сдвига элементов массива в строке на одлну позицию влево
     *
     * @param row массив строки из чисел
     */
    private void toLeftRow(int[] row)
    {
        for (int i = 0; i <= row.length - 1; i++)
        {
            /**
             * Присвоение последнему элементу массива чисел в строке значения 0
             */
            if (i == (row.length - 1))
            {
                row[i] = 0;
            }
            /**
             * Сдвиг элементов массива чисел в строке
             */
            else
            {
                row[i] = row[i + 1];
            }
            System.out.print(row[i] + " \t");
        }
    }

    /**
     * Формируем реверс в двумерном массиве
     */
    public void revers()
    {
        System.out.println("Реверс массива");
        for (int[] row : this.numbers)
        {
            this.reversRow(row);
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Формируем реверс массива чисел в одной строке
     * @param row массив чисел одной строки
     */
    private void reversRow(int[] row)
    {
        for (int i = 0; i <= (row.length - 1)/2; i++)
        {
            int temp = row[i];
            row[i] = row[(row.length - 1) - i];
            row[(row.length - 1) - i] = temp;
        }

        for (int i = 0; i < row.length; i++)
        {
            System.out.print(row[i] + " \t");
        }
    }
}