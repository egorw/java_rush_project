package com.javarush.task.task29.task2913;

import java.util.*;

/* 
Замена рекурсии
*/

public class Solution {
    private static int numberA;
    private static int numberB;

    public static String getAllNumbersBetween(int a, int b) {
        /*if (a > b) {
            return a + " " + getAllNumbersBetween(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + getAllNumbersBetween(a + 1, b);
        }*/
        //List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if (a > b) {
            for (int i = a; i >= b; i--) {
                //list.add(i);
                sb.append(i);
                sb.append(" ");
            }
            //return String.valueOf(list).trim();
            return sb.toString().trim();

        } else if (b > a) {
            for (int i = a; i <= b; i++) {
                //list.add(i);
                sb.append(i);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
        //return String.valueOf(list).trim();
    }

    public static void main(String[] args) {
        Random random = new Random();
        numberA = random.nextInt() % 1_000;
        numberB = random.nextInt() % 10_000;
        System.out.println(getAllNumbersBetween(numberA, numberB));
        System.out.println(getAllNumbersBetween(numberB, numberA));
    }
}