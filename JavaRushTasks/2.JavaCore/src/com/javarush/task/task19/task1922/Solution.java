package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (fr.ready()){
            int count = 0;
            String s = fr.readLine();
            String[] str = s.split(" ");
            for (String word : str){
                for (String cword : words){
                    if (word.equals(cword)) count++;
                }
            }
            if (count == 2) System.out.println(s);
        }
        fr.close();
    }
}
