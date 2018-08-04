package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] array = new int[5];
        for (int i = 0; i < 5; i++){
            int n = Integer.parseInt(reader.readLine());
            array[i] = n;
        }

        for (int i = 0; i < array.length-1; i++){
            for (int j = 0; j < array.length-1; j++){
                if (array[j+1] < array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
