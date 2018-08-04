package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private boolean sex;
        private int weight;
        private int height;
        private String address;


        public Human(String name, int age, boolean sex, int weight, int height, String address){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
            this.address = address;
        }
        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(int weight, int height, String address){
            this.weight = weight;
            this.height = height;
            this.address = address;
        }
        public Human(String name, boolean sex, String address){
            this.name = name;
            this.sex = sex;
            this.address = address;
        }
        public Human(String name, String address){
            this.name = name;
            this.address = address;
        }
        public Human(String name){
            this.name = name;
        }
        public Human(String address, boolean sex){
            this.address = address;
            this.sex = sex;
        }
        public Human(String address, int height, int weight){
            this.address = address;
            this.height = height;
            this.weight = weight;
        }
        public Human(boolean sex){
            this.sex = sex;
        }
        public Human(int age){
            this.age = age;
        }
    }
}
