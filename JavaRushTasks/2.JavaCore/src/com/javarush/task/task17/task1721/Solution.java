package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        while (file1.ready()){
            allLines.add(file1.readLine());
        }
        while (file2.ready()){
            forRemoveLines.add(file2.readLine());
        }
        file1.close();
        file2.close();

        Solution solution = new Solution();

        try {
            solution.joinData();
        }
        catch (CorruptedDataException e){
            System.out.println(e);
        }


    }

    public void joinData () throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }

        /*for (int i = 0; i < allLines.size(); i++) {
            for (int j = 0; j < forRemoveLines.size(); j++) {
                if (allLines.containsAll(forRemoveLines)) {
                    allLines.remove(allLines.get(i).equals(forRemoveLines.get(j)));
                }
                else allLines.clear();
            }
        }*/

    }
}
