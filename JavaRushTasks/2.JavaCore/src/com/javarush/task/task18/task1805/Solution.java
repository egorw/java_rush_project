package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/
//C:\Users\Egor\Desktop\Egor.txt
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(reader.readLine());
        reader.close();
        TreeSet<Integer> list = new TreeSet<>();

        while (in.available() > 0){
            int data = in.read();
            list.add(data);
        }

        for (Integer i : list){
            System.out.print(i + " ");
        }


        in.close();

    }
}
