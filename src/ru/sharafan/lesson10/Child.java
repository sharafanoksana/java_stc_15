package ru.sharafan.lesson10;

import java.util.Random;

class Child {

    public void toEat(Food food) throws BadFoodException
    {
        Random random = new Random();
        boolean r = random.nextBoolean();
        if (r != true) {
            throw new BadFoodException(food);
        }
        System.out.println("<Ребенок>: Мне нравится " + food.name() + "!");
    }
    public void toSayTankYou(){
        System.out.println("<Ребенок>: Спасибо, мамочка!");
    }
}

