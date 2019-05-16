package ru.sharafan.lesson10;

import java.util.Random;

class Mother {

    private Child child;

    public Mother()
    {
        this.child = new Child();
    }

    public void toFeed(){
        Food food = this.getFood();
        System.out.println("<Мама>: Скушай кусочек " + food.name());
        try
        {
            this.child.toEat(food);
        } catch (BadFoodException e)
        {
            System.out.println(e.getMessage());
            System.out.println("<Мама>: Тебе не нравится " + food + "? Ну ладно )))");
        }
        finally
        {
            this.child.toSayTankYou();
        }
    }

    /**
     * Определение вида еды
     * @return возвращает рандомный индекс enum Food
     */
        public Food getFood (){
            Random random = new Random();
            int r = random.nextInt(10);
            return (Food.values()[r]);
        }
}

