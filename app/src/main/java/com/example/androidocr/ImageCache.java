package com.example.androidocr;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Vector;

/**
 * Created by fed007 on 2018-01-20.
 */

public class ImageCache {

    private static ImageCache cache;

    public static ImageCache getInstance(){
        return cache;
    }




    private Vector<String> images;

    public ImageCache(){

        images = new Vector();
        ImageCache.cache = this;

    }

    public  int getCacheSize() {
        return images.size();
    }


    public void addImage(String filePath){

        images.add(filePath);

    }

    public String getLatestImagePath(){

        return images.lastElement();
    }

    public Bitmap getLatestImageBitmap(){
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;

        return BitmapFactory.decodeFile(images.lastElement());

    }

}
