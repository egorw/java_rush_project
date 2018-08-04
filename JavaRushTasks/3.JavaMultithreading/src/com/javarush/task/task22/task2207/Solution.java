package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));

        Pair pair;

        while (fr.ready()){
            list.addAll(Arrays.asList(fr.readLine().split(" ")));
        }


        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.size(); j++){
                if (list.get(i) == null || list.get(j) == null) continue;
                StringBuilder sb = new StringBuilder(list.get(i)).reverse();
                pair = new Pair();
                if (sb.toString().equals(list.get(j)) && i != j){
                    pair.first = list.get(i);
                    pair.second = list.get(j);
                    result.add(pair);
                    list.set(i, null);
                    list.set(j, null);
                }
            }
        }
        reader.close();
        fr.close();
        System.out.println(result);
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
