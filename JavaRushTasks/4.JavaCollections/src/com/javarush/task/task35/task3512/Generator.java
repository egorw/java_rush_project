package com.javarush.task.task35.task3512;

public class Generator<T> {

    Class<T> tClass;
    Generator(Class<T> tClass){
        this.tClass = tClass;
    }
    T newInstance() throws IllegalAccessException, InstantiationException {
        T generator = tClass.newInstance();
        return generator;
    }
}
