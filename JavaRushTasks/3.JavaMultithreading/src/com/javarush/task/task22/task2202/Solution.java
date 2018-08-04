package com.javarush.task.task22.task2202;

import java.util.ArrayList;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.isEmpty()) {
            throw new TooShortStringException();
        }
        int firstIndex = string.indexOf(" ") + 1;
        int count = 0;
        int lastIndex = 0;
        char[] list = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (list[i] == ' ') {
                count++;
                if (count == 4){
                    lastIndex = string.length();
                }
                else if (count == 5){
                    lastIndex = i;
                    break;
                }

            }
        }
        if (count < 4) {
            throw new TooShortStringException();
        }

        return string.substring(firstIndex, lastIndex);

    }

    public static class TooShortStringException extends RuntimeException {
    }
}
