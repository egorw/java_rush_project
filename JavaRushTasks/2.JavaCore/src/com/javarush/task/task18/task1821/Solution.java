package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream(args[0]);

        byte[] buff = new byte[in.available()];
        in.read(buff);

        Arrays.sort(buff);

        HashMap<Byte, Integer> map = new HashMap<>();

        int count;

        for (byte x : buff){
            count = 0;
            for (byte symb : buff){
                if (x == symb){
                    count++;
                }
            }
            if (!map.containsKey(x)){
                map.put(x, count);
                System.out.println((char)x + " " + count);
            }
        }

        in.close();

    }
}

/*
FileReader reader = new FileReader(args[0]);
        TreeMap map = new TreeMap();
        while (reader.ready()) {
            char s = (char) reader.read();
            if (!map.containsKey(s)) map.put(s, 1);
            else map.put(s, map.get(s) + 1);
        }
        for (Map.Entry pair: map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        reader.close();
 */
