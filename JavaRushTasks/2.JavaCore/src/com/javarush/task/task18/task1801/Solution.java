package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Максимальный байт
*/


public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList();

        while (in.available() > 0){
            list.add(in.read());
        }
        reader.close();


        Collections.sort(list);

        if (list.size() > 0) {
            System.out.println(list.get(list.size() - 1));
        }

        /*int max = list.get(0);
        for (int i = 0; i < list.size(); i++){
            if (max < list.get(i)) max = list.get(i);
        }
        System.out.println(max);*/

        /*for (Integer i : list){
            System.out.println(i + " ");
        }*/


        in.close();
    }

}
