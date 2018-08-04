package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }

        int maxIn = 0;
        int minIn = 0;
        int max = list.get(0).length();
        int min = list.get(0).length();
        for (int i = 0; i < list.size()-1; i++){

            if (list.get(i).length() > max){
                max = list.get(i).length();
                maxIn = i;
            }
            if (list.get(i).length() < min){
                min = list.get(i).length();
                minIn = i;

            }
        }
        if (minIn < maxIn) System.out.println(list.get(minIn));
        else System.out.println(list.get(maxIn));
    }
}
