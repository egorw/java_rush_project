package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        //Создаем массив, размеров в длину листа
        //Каждый элемент листа переведем в символ и запишем в массив
        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i]) == true){
                for (int j = 0; j < array.length-1; j++){
                    if (isNumber(array[j]) == true){
                        int a = Integer.parseInt(array[i]);
                        int b = Integer.parseInt(array[j]);
                        if (a > b){
                            String s = array[i];
                            array[i] = array[j];
                            array[j] = s;
                        }
                    }
                }
            }
            else {
                for (int j = 0; j < array.length; j++){
                    if (isNumber(array[j]) == false){
                        if (isGreaterThan(array[j], array[i])){
                            String s = array[i];
                            array[i] = array[j];
                            array[j] = s;
                        }
                    }
                }
            }


        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        //Если а больше б то true
        //Если а меньше б то false
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        //Если на проверку в строке прислали пробел то false
        if (s.length() == 0) return false;

        //переводим строку в массив символов
        //бежим по каждому символу и
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            //если встречается символ, который не является числом и это не "минус", то false
            //и по циклу дальше не бежим
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        //если в строке все символы являются числами, то цикл оканчивается true
        return true;
    }
}
