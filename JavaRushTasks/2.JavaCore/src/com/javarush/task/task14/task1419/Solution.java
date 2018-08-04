package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {

            float i = 1 / 0;
        }

        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[5];
            array[7] = 0;
        }
        catch (IndexOutOfBoundsException e){
            exceptions.add(e);
        }

        try {
            int[] array1 = new int[-5];
            array1[3] = 0;
        }
        catch (NegativeArraySizeException e){
            exceptions.add(e);
        }

        try {
            Solution solution = new Solution();
            throw new  NullPointerException();
        }
        catch (NullPointerException e){
            exceptions.add(e);
        }

        try {
            throw new SecurityException();
        }
        catch (SecurityException e){
            exceptions.add(e);
        }

        try {
            throw new UnsupportedOperationException();
        }
        catch (UnsupportedOperationException e){
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e){
            exceptions.add(e);
        }

        try {
            throw new ClassCastException();
        }
        catch (ClassCastException e){
            exceptions.add(e);
        }

        try {
            throw new ClassNotFoundException();
        }
        catch (ClassNotFoundException e){
            exceptions.add(e);
        }

        try {
            throw new InstantiationException();
        }
        catch (InstantiationException e){
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}
