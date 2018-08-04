package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(reader.readLine());
        reader.close();

        Map<Integer, Integer> array = new HashMap<Integer, Integer>();
        ArrayList<Integer> ar = new ArrayList<Integer>();
//заполняем мапу значениями кол-во байт - число повторов
        while(in.available() > 0){
            int data = in.read();
            if (array.containsKey(data)){
                array.put(data,array.get(data)+1);
            }else {
                array.put(data, 1);
            }
        }
        //определяем максимальные повторения и помещаем их в массив
        int max = 0;
        for (Map.Entry entry : array.entrySet()){
            int i = (Integer)entry.getValue();
            if (max == 0||i > max){
                max = i;
                ar.clear();
                ar.add((Integer)entry.getKey());
            }else if(max == i){
                ar.add((Integer)entry.getKey());
            }
        }
        //выводим на экран из массива
        for(int i : ar){
            System.out.print(i + " ");
        }
        in.close();
        reader.close();

    }
}
