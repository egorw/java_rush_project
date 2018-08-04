package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream cs = System.out;
        ByteArrayOutputStream ops = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(ops);
        System.setOut(stream);
        testString.printSomething();
        char[] result = ops.toString().toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < result.length; i++){
            if (Character.isDigit(result[i])) list.add(result[i]);
        }
        System.setOut(cs);
        for (Character dig : list) System.out.print(dig);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
