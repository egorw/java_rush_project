package com.javarush.task.task12.task1225;

/* 
Что это? «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное»
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        Cat cat = new Tiger();
        if (o instanceof Tiger){
            Tiger tiger = (Tiger) cat;
        return "Тигр";
        }
        Cat cat2 = new Lion();
        if (o instanceof Lion){
            return "Лев";
        }
        Cat cat1 = new Cat();
        if (o instanceof Cat){
            return "Кот";
        }
        Animal animal = new Bull();
        if (o instanceof Bull){
            return "Бык";
        }
        Animal animal1 = new Cow();
        if (o instanceof Cow){
            return "Корова";
        }

        else
        return "Животное";
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
