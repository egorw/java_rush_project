package com.javarush.task.task19.task1921;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {

        String file = args[0];
        String in;
        ArrayList<String> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((in = br.readLine()) != null){
            list.add(in);
        }
        br.close();

        for (String str : list){
            String[] array = str.split(" ");
            String name = "";
            for (int i = 0; i < array.length-3; i++){
                if (i == array.length-4){
                    name += array[i];
                }
                else name += array[i] + " ";
            }
            //int year = Integer.parseInt(array[array.length-1]);
            //int month = Integer.parseInt(array[array.length-2])-1;
            //int day = Integer.parseInt(array[array.length-3]);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            Date date = simpleDateFormat.parse(array[array.length-3] + " " + array[array.length-2]+ " " + array[array.length-1]);
            PEOPLE.add(new Person(name, date));
        }
    }
}
