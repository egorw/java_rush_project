package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.*;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Double> map = new TreeMap<>();
        String file = args[0];
        BufferedReader br = new BufferedReader(new FileReader(file));
        while (br.ready()){
            //int count = 0;
            Double d;
            String[] str = br.readLine().split(" ");
                if (map.containsKey(str[0])){
                    d = map.get(str[0]);
                    map.put(str[0], Double.parseDouble(str[1]) + d);
            }
            else map.put(str[0], Double.parseDouble(str[1]));
        }
        br.close();

        Double max = Collections.max(map.values());

        for (Map.Entry<String, Double> pair : map.entrySet()){
            if (pair.getValue().equals(max)) System.out.println(pair.getKey());
        }
    }
}
