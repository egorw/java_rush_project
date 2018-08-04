package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable{
    public static void main(String[] args) {
        System.out.println(new Solution(4));

        Solution savedObject = new Solution(4);
        Solution loadedObject = new Solution(4);

        System.out.println(savedObject.equals(loadedObject));



        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Egor\\Desktop\\Filet"));
            oos.writeObject(savedObject);
            oos.close();
        }
        catch (IOException e)
        {
            System.out.println("Error!");
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Egor\\Desktop\\Filet"));
            loadedObject = (Solution) ois.readObject();
            ois.close();
        }

        catch (ClassNotFoundException e)
        {
            System.out.println("Not found!");
        }

        catch (IOException e)
        {
            System.out.println("Error!");
        }



    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
