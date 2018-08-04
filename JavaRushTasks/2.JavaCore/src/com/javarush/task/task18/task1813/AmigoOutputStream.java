package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream  extends FileOutputStream{
    public static String fileName = "C:\\Users\\Egor\\Desktop\\Egor.txt";
    public FileOutputStream fout;

    public AmigoOutputStream(FileOutputStream fout) throws FileNotFoundException {
        super(fileName);
        this.fout = fout;
    }

    public void write(int b) throws IOException {
        fout.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException {
        fout.write(b, off, len);
    }

    protected void finalize() throws IOException {
        super.finalize();
    }

    public void write(byte[] b) throws IOException {
        fout.write(b);
    }

    public void flush() throws IOException {
        fout.flush();
    }

    public void close() throws IOException {
        fout.flush();
        fout.write("JavaRush © All rights reserved.".getBytes());
        fout.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
