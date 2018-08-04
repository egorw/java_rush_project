package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Egor on 28.03.2017.
 */
public class ImageReaderFactory {

    /*
    public static ImageTypes getImageReader(ImageTypes JpgReader) {
        return JpgReader;
    }
    public static ImageTypes getImageReader(ImageTypes BmpReader) {
        return BmpReader;
    }
    public static ImageTypes getImageReader(ImageTypes PngReader) {
        return PngReader;
    }
    */
    public static ImageReader getImageReader(ImageTypes type) {
        if (type == ImageTypes.JPG)
            return new JpgReader();
        else if (type == ImageTypes.BMP)
            return new BmpReader();
        else if (type == ImageTypes.PNG)
            return new PngReader();

        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
