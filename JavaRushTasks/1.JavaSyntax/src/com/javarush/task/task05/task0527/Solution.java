package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse nibblesMouse = new Mouse("Nibbles", 9, 3);

        Dog spikeDog = new Dog("Spike", 57, 10);
        Dog tykeDog = new Dog("Tyke", 23, 7);

        Cat tomCat = new Cat("Tom", 33, 17);
        Cat toodlesCat = new Cat("Toodles", 30, 15);
        Cat butchCat = new Cat("Butch", 32, 17);
        Cat lightningCat = new Cat("Lightning)", 31, 15);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
    public static class Dog{
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat{
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

    }

}
