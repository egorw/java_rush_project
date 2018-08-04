package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

import java.util.Objects;

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<Objects>();
    }

    interface SimpleObject<T>  {
        SimpleObject<T> getInstance();
    }

    public static class StringObject<Objects> implements SimpleObject<String>{

        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }

}
