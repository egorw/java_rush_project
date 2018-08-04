package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String c = stackTraceElement[2].getClassName();
        String m = stackTraceElement[2].getMethodName();
        System.out.println(c + ": " + m + ": " + s);
    }
}
