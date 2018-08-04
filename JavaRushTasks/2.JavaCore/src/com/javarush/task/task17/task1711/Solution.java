package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        if (args.length > 0) {
            switch (args[0]) {
                case "-c" : synchronized (allPeople){
                    int nextIdBeginning = 1;
                    String fullName;
                    int sexIndex;
                    Date date;
                    for (int i = 1; i < args.length; i++) {
                        if (args[i].contains("/")) {
                            StringBuilder stringbuilder = new StringBuilder();
                            for (int j = nextIdBeginning; j < (i - 1); j++) {
                                stringbuilder.append(args[j]);
                                stringbuilder.append(" ");
                            }
                            fullName = stringbuilder.toString().trim();         //имя
                            sexIndex = i - 1;           //пол
                            date = format.parse(args[i]);          //дата рождения
                            if (args[sexIndex].equals("м"))
                            {
                                allPeople.add(Person.createMale(fullName, date));
                            } else if (args[sexIndex].equals("ж"))
                            {
                                allPeople.add(Person.createFemale(fullName, date));
                            }
                            System.out.println(allPeople.size()-1);
                            nextIdBeginning = i + 1;
                        }
                    }
                }
                break;
                case "-u" : synchronized (allPeople){
                    int nextIdBeginning = 1;
                    String fullName;
                    int sexIndex;
                    Date date;
                    for (int i = 1; i < args.length; i++) {
                        if (args[i].contains("/")) {
                            StringBuilder stringbuilder = new StringBuilder();
                            for (int j = nextIdBeginning + 1; j < (i - 1); j++) {
                                stringbuilder.append(args[j]);
                                stringbuilder.append(" ");
                            }
                            fullName = stringbuilder.toString().trim();         //имя
                            sexIndex = i - 1;           //пол
                            date = format.parse(args[i]);          //дата рождения
                            int id = Integer.parseInt(args[nextIdBeginning]);
                            allPeople.get(id).setName(fullName);
                            if (args[sexIndex].equals("м")) {
                                allPeople.get(id).setSex(Sex.MALE);
                            } else if (args[sexIndex].equals("ж")) {
                                allPeople.get(id).setSex(Sex.FEMALE);
                            }
                            allPeople.get(id).setBirthDay(date);
                            nextIdBeginning = i + 1;
                        }
                    }
                }
                break;
                case "-d" : synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        allPeople.get(id).setName(null);
                        allPeople.get(id).setSex(null);
                        allPeople.get(id).setBirthDay(null);
                    }
                }
                break;
                case "-i" : synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        String sex;
                        if (allPeople.get(id).getSex().toString().equals("MALE")) sex = "м";
                        else sex = "ж";
                        System.out.println(allPeople.get(id).getName() + " " + sex + " " + df.format(allPeople.get(id).getBirthDay()));
                    }
                }
                break;
            }
        }
    }
}
/*
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        switch (args[0])
        {
            case "-c": synchronized (allPeople) {CreateC(args);}
            break;
            case "-u": synchronized (allPeople) {UpdateU(args);}
            break;
            case "-d": synchronized (allPeople) {DeleteD(args);}
            break;
            case "-i": synchronized (allPeople) {InfoI(args);}
            break;
        }
    }
    public static void CreateC(String[] args) throws ParseException
    {
        if ((args.length - 1) % 3 != 0) return;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        for (int i = 1; i < args.length; i = i + 3)
        {
            if ((args[i+1].equals("м"))) { allPeople.add(Person.createMale(args[i], format.parse(args[i+2]))); System.out.println(allPeople.size() - 1);}
            if ((args[i+1].equals("ж"))) { allPeople.add(Person.createFemale(args[i], format.parse(args[i+2]))); System.out.println(allPeople.size() - 1);}
        }
    }
    public static void UpdateU(String[] args) throws ParseException
    {
        if ((args.length - 1) % 4 != 0) return;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Sex sex = null;
        for (int i = 1; i < args.length; i = i + 4)
        {
            if ((args[i+2].equals("м"))) {sex = Sex.MALE;}
            if ((args[i+2].equals("ж"))) {sex = Sex.FEMALE;}
            allPeople.get(Integer.parseInt(args[i])).setName(args[i+1]);
            allPeople.get(Integer.parseInt(args[i])).setSex(sex);
            allPeople.get(Integer.parseInt(args[i])).setBirthDay(format.parse(args[i+3]));
        }
    }
    public static void DeleteD(String[] args)
    {
        for (int i = 1; i < args.length; i++)
        {
            allPeople.get(Integer.parseInt(args[i])).setName(null);
            allPeople.get(Integer.parseInt(args[i])).setSex(null);
            allPeople.get(Integer.parseInt(args[i])).setBirthDay(null);
        }
    }
    public static void InfoI(String[] args)
    {
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String sexy= "";
        for (int i = 1; i < args.length; i++)
        {
            if (allPeople.get(Integer.parseInt(args[i])).getSex() == Sex.MALE) {sexy = "м";}
            if (allPeople.get(Integer.parseInt(args[i])).getSex() == Sex.FEMALE) {sexy = "ж";}
            System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " " + sexy + " " + format.format(allPeople.get(Integer.parseInt(args[i])).getBirthDay()));
        }
    }
}
 */
