package com.javarush.task.task35.task3501;

public class GenericStatic {
    public static <T> T someStaticMethod(T a) {
        System.out.println(a);
        return a;
    }
}
