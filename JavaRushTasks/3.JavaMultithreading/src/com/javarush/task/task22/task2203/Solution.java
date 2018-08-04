package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.isEmpty()) throw new TooShortStringException();
        int count = string.length() - string.replaceAll("\t", "").length();
        if (count < 2) throw new TooShortStringException();
        int start = string.indexOf("\t") + 1;
        String result = string.substring(start, string.indexOf("\t", start));

        return result;
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
