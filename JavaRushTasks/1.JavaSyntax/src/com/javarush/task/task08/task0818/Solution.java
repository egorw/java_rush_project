package com.javarush.task.task08.task0818;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Ivanov", 10000);
        map.put("Petrov", 9000);
        map.put("Sidorov", 7000);
        map.put("Fedorov", 3000);
        map.put("Klimov", 2000);
        map.put("Vasilyev", 1000);
        map.put("Fadeev", 1000);
        map.put("Kireev", 900);
        map.put("Maximov", 700);
        map.put("Alekseev", 300);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}