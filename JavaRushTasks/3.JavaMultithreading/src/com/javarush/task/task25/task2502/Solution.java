package com.javarush.task.task25.task2502;

import java.util.*;

/* 
Машину на СТО не повезем!
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;
        int wheelcount = 0;
        public Car() throws Exception {
            //init wheels here
            this.wheels = new ArrayList<>();
            for (String str : loadWheelNamesFromDB()){
                wheels.add(Wheel.valueOf(str));
                wheelcount++;
            }
            if (wheelcount != 4) throw new Exception();

        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) throws Exception {

    }
}
