package com.javarush.task.task25.task2512;

import java.util.ArrayList;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        ArrayList<Throwable> list = new ArrayList<>();
        list.add(e);
        Throwable traceElement = e;
        while (traceElement.getCause()!=null) {
            traceElement = traceElement.getCause();
            list.add(0,traceElement);
        }

        for (Throwable t1: list) {
            System.out.println(t1);
        }
    }

    public static void main(String[] args) {
        Throwable e =  new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI")));
        new Solution().uncaughtException(Thread.currentThread(), e);
    }
}
