package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream ps = System.out;
        ByteArrayOutputStream ops = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(ops);
        System.setOut(stream);
        testString.printSomething();
        String[] s = ops.toString().split(" ");
        int one = Integer.parseInt(s[0]);
        int two = Integer.parseInt(s[2]);
        int resalt = 0;
        if (s[1].equals("+")) resalt = one + two;
        if (s[1].equals("-")) resalt = one - two;
        if (s[1].equals("*")) resalt = one * two;
        String value = s[0] + " " + s[1] + " " + s[2] + " " + s[3] + " " + resalt;
        /*int result1 = Integer.parseInt(ops.toString().substring(0, 1));
        int result2 = Integer.parseInt(ops.toString().substring(4, 5));
        int result = 0;
        if (ops.toString().substring(2, 3).equals("+")){
            result = result1 + result2;
        }
        if (ops.toString().substring(2, 3).equals("-")){
            result = result1 - result2;
        }
        if (ops.toString().substring(2, 3).equals("*")){
            result = result1 * result2;
        }

        String value = ops.toString().trim() + " " + result;*/
        System.setOut(ps);
        System.out.print(value);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

