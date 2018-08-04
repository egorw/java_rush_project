package com.javarush.task.task15.task1522;

/**
 * Created by Egor on 20.03.2017.
 */
public class Moon implements Planet{
    private static Moon instance;

    Moon(){

    }

    public static Moon getInstance(){
        if (instance == null){
            instance = new Moon();
        }
        return instance;
    }
}
