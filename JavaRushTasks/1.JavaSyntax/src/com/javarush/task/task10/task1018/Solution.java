package com.javarush.task.task10.task1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Поправочки нужны
*/

public class Solution {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Solution() {
        this.map = new HashMap<Integer, String>();
        //map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }

        /*for (Map.Entry<int, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }*/

        Iterator<Map.Entry<Integer, String>> iterator = solution.map.entrySet().iterator();

            while (iterator.hasNext()){
                Map.Entry<Integer, String> pair = iterator.next();
                index = pair.getKey();
                name = pair.getValue();
                //if (index.equals(Solution.index)) iterator.remove();
                //if (name.equals(Solution.name)) iterator.remove();

                System.out.println("Id=" + index + " Name=" + name);
            }



    }
}
