package com.javarush.task.task20.task2022;

import java.io.*;



/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(fileName);
        //out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        //in.close();
        this.stream = new FileOutputStream(this.fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution solution = new Solution("C:\\Users\\Egor\\Desktop\\File1.txt");
        solution.writeObject("Hello!");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Egor\\Desktop\\File.txt"));
        oos.writeObject(solution);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Egor\\Desktop\\File.txt"));
        Solution nsolution = (Solution) ois.readObject();
        nsolution.writeObject("World!");

    }
}
