package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {

    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = reader.readLine();
            if (line.equals("exit")) break;
            new ReadThread(line).start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) {
            super(fileName);
        }

        public void run() {
            try {
                FileInputStream fis = new FileInputStream(this.getName());
                Map<Integer, Integer> map = new HashMap<>();
                int maxByteCount = Integer.MIN_VALUE;
                int maxByte = 0;

                while (fis.available() > 0) {
                    int b = fis.read();
                    if (map.containsKey(b)) map.put(b, map.get(b) + 1);
                    else map.put(b, 1);
                }

                fis.close();

                for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                    if (pair.getValue() > maxByteCount) {
                        maxByteCount = pair.getValue();
                        maxByte = pair.getKey();
                    }
                }

                synchronized (Solution.class) {
                    resultMap.put(this.getName(), maxByte);
                }
            }
            catch (IOException e) {
            }
        }
    }
}