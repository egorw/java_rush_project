package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        int n;
        //String s;

        while (true) {

            String s = reader.readLine();
            if (s.isEmpty()) break;
            int id = Integer.parseInt(s);


            String name = reader.readLine();
            if (name.isEmpty()) break;

            map.put(name, id);


        }
        //System.out.println("Id=" + id + " Name=" + name);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            Integer value = pair.getValue();
            String key = pair.getKey();

            System.out.println(value + " " + key);
        }


    }
}
