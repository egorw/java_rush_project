package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.ArrayList;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        char[] n = number.toCharArray();
        for (char ch : n){
            if (Character.getNumericValue(ch) % 2 != 0)
                odd++;
            else even++;
        }
        System.out.println("Even: " + even + " " + "Odd: " + odd);



    }
}
