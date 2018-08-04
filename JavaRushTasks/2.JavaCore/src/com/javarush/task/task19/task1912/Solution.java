package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
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
        String result = ops.toString().replace("te", "??");
        System.setOut(cs);

        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
