package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws Exception {


        try {
            method1();
        }
        catch (MyException2 e){

        }
        catch (MyException e){

        }


    }

    public static void method1() throws MyException3, MyException4, MyException2, MyException
    {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new MyException();
        if (i == 1)
            throw new MyException2();
        if (i == 2)
            throw new MyException3();
        if (i == 3)
            throw new MyException4();
    }
    
    static class MyException extends IOException {
    }

    static class MyException2 extends FileNotFoundException {
    }

    static class MyException3 extends IndexOutOfBoundsException{
    }

    static class MyException4 extends RuntimeException{

    }
}

