package com.javarush.task.task28.task2801;

import static com.javarush.task.task28.task2801.Solution.E1.*;

/*
Осваиваем switch
*/
public class Solution {
    public static enum E1 {A, B, C, Y}

    public static enum E2 {D, E, F}

    public static enum E3 {D, E, F}

    public static void main(String[] args) {
        Solution.switchTest(E1.C);
        Solution.switchTest(E3.D);
        Solution.switchTest(E2.D);
        /* output
        it's E1.C
        undefined
        it's E2.D
         */
    }

    public static void switchTest(Enum obj) {
        //add your code here
        String eclass = obj.getClass().getSimpleName();
        switch (obj.getClass().getSimpleName()){
            case "E1":
                System.out.println("it's " + eclass + "." + obj);
                break;
            case "E2":
                System.out.println("it's " + eclass + "." + obj);
                break;
            default:
                System.out.println("undefined");
        }
    }
}
