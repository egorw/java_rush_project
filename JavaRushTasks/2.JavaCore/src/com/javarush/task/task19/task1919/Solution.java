package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];
        TreeMap<String, Double> map = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.ready()){
            String[] str = reader.readLine().split(" ");
            Double x;
            if (map.containsKey(str[0])) {
                x = map.get(str[0]);
                map.put(str[0], Double.parseDouble(str[1]) + x);
            }
            else map.put(str[0], Double.parseDouble(str[1]));
        }
        reader.close();
        for (Map.Entry<String, Double> treemap : map.entrySet()){
            System.out.println(treemap.getKey() + " " + treemap.getValue());
        }
    }
}
