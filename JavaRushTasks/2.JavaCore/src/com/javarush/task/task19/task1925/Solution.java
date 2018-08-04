package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];
        //FileReader fr = new FileReader(file1);
        //FileWriter fw = new FileWriter(file2);
        BufferedReader fr = new BufferedReader(new FileReader(file1));
        BufferedWriter fw = new BufferedWriter(new FileWriter(file2));

        StringBuilder sb = new StringBuilder();

        while (fr.ready()){
            String[] str = fr.readLine().split(" ");
            for (int i = 0; i < str.length; i++){
                if (str[i].length() > 6) sb.append(str[i] + ",");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        fw.write(sb.toString());

        fr.close();
        fw.close();
    }
}
