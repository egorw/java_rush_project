package com.javarush.task.task21.task2113;

/**
 * Created by Egor on 10.06.2017.
 */
public class Horse {
    String name;
    double speed;
    double distance;

    public Horse(String name, double speed, double distance){
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void move(){
        distance += speed * Math.random();
    }

    public void print(){
        for (int i = 1; i < Math.round(distance); i++){
            System.out.print('.');
        }
        System.out.println(name);
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
