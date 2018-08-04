package com.javarush.task.task34.task3408;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;

public class Cache<K, V> {
    private Map<K, V> cache = new WeakHashMap<>();   //TODO add your code here

    public V getByKey(K key, Class<V> clazz) throws Exception {
        //TODO add your code here
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        else
            return cache.put(key, clazz.getConstructor(key.getClass()).newInstance(key));
    }

    public boolean put(V obj) throws NoSuchMethodException {
        //TODO add your code here
        try {

            Method method = obj.getClass().getDeclaredMethod("getKey");
            method.setAccessible(true);

            cache.put((K)method.invoke(obj), obj);
            return cache.containsKey((K)method.invoke(obj));


        }
        catch (Exception ignore){}

        return false;
    }

    public int size() {
        return cache.size();
    }
}
