package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        int sumCh = 0;
        int sumNch = 0;
        for (int i = 0; i < 15; i++){
            int n = Integer.parseInt(reader.readLine());
            array[i] = n;
            if (i%2==0) sumCh += n;
            else sumNch += n;
        }
        if (sumCh > sumNch) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
        //System.out.println(sumCh);


    }
}
