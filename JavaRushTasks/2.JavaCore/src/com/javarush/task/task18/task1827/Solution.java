package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) throws IOException {


        if (!("-c".equals(args[0])))
            return;
        String productName = args[1];
        String price = args[2];
        String quantity = args[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        fileName = reader.readLine();
        BufferedReader readerF = new BufferedReader(new FileReader(fileName));
        ArrayList<String> list = new ArrayList<>();
        Long id = new Long(0);
        String str;
        String tmp;
        while (readerF.ready()) {
            list.add(str = readerF.readLine());
            int k = str.indexOf(" ");
            if (k > 8)
                tmp = str.substring(0, 8);
            else
                tmp = str.substring(0, k);
            if (Long.parseLong(tmp) > id)
                id = Long.parseLong(tmp);
        }

        tmp = String.format("%-8d%-30.30s%-8s%-4s", (++id), productName, price, quantity);
        BufferedWriter writerF = new BufferedWriter(new FileWriter(fileName));
        for (String s : list)
            writerF.write(s + "\n");
        writerF.write(tmp.toString());
        reader.close();
        readerF.close();
        writerF.close();
    }
/*
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String pathIn = bufferedReader.readLine();

    String param1 = args[0];
    String param2 = args[1];
    String param3 = args[2];
    String param4 = args[3];

    String id = "id******";
    param2 = method(param2, 30);
    param3 = method(param3, 8);
    param4 = method(param4, 4);

        System.out.println(id + param2 + param3 + param4);
}

    private static String method(String param, int count) {
        String result ="";
        if (param.length() < count){
            int tmp = count - param.length();
            result = param;
            for (int i = 0; i<tmp; i++){
                result += " ";
            }
        } else {
            result=  param.substring(0, count);
        }
        return result;
    }

    */

    /*
    static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        BufferedReader file = new BufferedReader(new FileReader(name));
        int max = 0;
        if (args[0].equals("-c"))
        {
            while (file.ready())
            {
                String str = file.readLine();
                list.add(str);
                int y = Integer.parseInt(str.substring(0,8).replaceAll(" ",""));
                if (y > max) max = y;

            }
            max++;
            file.close();
            BufferedWriter fileWR = new BufferedWriter(new FileWriter(name));
            for (int i = 0; i < list.size();i++)
            {
                if (list.get(i).equals("")) continue;
                fileWR.write(String.format("%s%n", list.get(i)));
            }
            String productname = args[1];
            for (int l = 2; l < args.length-2; l++)
                productname +=" " + args[l];
            fileWR.write(String.format("%-8.8s%-30.30s%-8.8s%-4.4s%n",String.valueOf(max),productname,args[args.length-2],args[args.length-1]));
            fileWR.close();
        }
    }

        /*
        //args = new String[] {"-c", "asdaskjфыдфлдыдфлыо", "121", "12"};
        String productName = padRight(args[1], 30);
        String price = padRight(args[2], 8);
        String quantity = padRight(args[3], 4);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        String id = padRight(String.valueOf(getMaxId(fileName) + 1), 8);

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true));
        fileWriter.write(id + productName + price + quantity);
        fileWriter.newLine();
        fileWriter.close();
    }

    private static String padRight(String input, int length) {
        if (input.length() < length) {
            return String.format("%1$-" + length + "s", input);
        } else {
            return input.substring(0, length);
        }
    }

    private static long getMaxId(String fileName) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        long maxId = 0;
        long currId;
        String line;
        while ((line = fileReader.readLine()) != null) {
            currId = Integer.parseInt(line.substring(0, 8).trim());
            if (currId > maxId) {
                maxId = currId;
            }
        }
        fileReader.close();
        return maxId;


       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        String productName = "";

        for (int i = 1; i < args.length-2; i++)
            productName = productName + args[i] + " ";
        String trueProductName = setSpaces(productName, 30);

        String truePrice = setSpaces(args[args.length-2], 8);
        String trueQuantity = setSpaces(args[args.length-1], 4);

        String id = getId(fileName);
        id = setSpaces(id, 8);
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        printWriter.println(id + trueProductName + truePrice + trueQuantity);
        printWriter.close();

    }

    public static String getId (String fileName) throws IOException {
        ArrayList<Long> allIds = new ArrayList<Long>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        Long currentId;
        while ((line=bufferedReader.readLine()) != null) {
            line = line.substring(0, 8).replaceAll("\\s", "");
            currentId = Long.parseLong(line);
            allIds.add(currentId);
        }
        bufferedReader.close();
        Long maxId = Collections.max(allIds);
        Long MyId = maxId+1;
        return MyId.toString();
    }


    public static String setSpaces (String previousName, int count) {
        String trueName;
        if (previousName.length()>count)
            trueName = previousName.substring(0, count);
        else
        {
            String s="";
            for (int i = 0; i < (count  - previousName.length()); i++)
                s = s+ " ";
            trueName = previousName+s;
        }
        return trueName;*/


}

