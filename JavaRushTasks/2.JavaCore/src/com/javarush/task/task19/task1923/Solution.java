package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Egor\\Desktop\\File.txt"));
        BufferedWriter fw = new BufferedWriter(new FileWriter("C:\\Users\\Egor\\Desktop\\Ch.txt"));

        while (br.ready()){
            String s = br.readLine();
            String[] str = s.split(" ");
            for (String word : str){
                if (word.matches(".*\\d.*")){
                    fw.write(word + " ");
                }
            }
        }
        br.close();
        fw.close();
    }
}
