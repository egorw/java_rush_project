package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int count = 0;
        while (true){
             int n = Integer.parseInt(reader.readLine());
             sum += n;
             count++;
             if (n ==  -1)  break;

        }
        System.out.println((sum + 1)/(count-1));
    }
}

