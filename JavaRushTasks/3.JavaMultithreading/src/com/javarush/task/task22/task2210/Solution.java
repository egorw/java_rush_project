package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
       String [] string = getTokens("level22.lesson13.task01", ".");
       for (String s : string) System.out.println(s);
    }
    public static String [] getTokens(String query, String delimiter) {

        StringTokenizer st = new StringTokenizer(query, delimiter);
        List<String> words = new ArrayList<>();
        while (st.hasMoreTokens()){
            String str = st.nextToken();
            words.add(str);
        }
        String [] s = new String[words.size()];
        for (int i = 0; i < s.length; i++){
            s[i] = words.get(i);
        }
        return s;
    }
}
