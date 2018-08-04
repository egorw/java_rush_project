package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        PrintStream cs = System.out;
        ByteArrayOutputStream ops = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(ops);
        System.setOut(stream);

        testString.printSomething();

        String result = ops.toString();

        String file = reader.readLine();

        FileOutputStream out = new FileOutputStream(file);
        ops.writeTo(out);

        System.setOut(cs);

        reader.close();

        System.out.println(result);

        out.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

