package com.example.gridviewdemo;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private final Context imageContext;

    public ImageAdapter(Context c){
        imageContext = c;
    }
    @Override
    public int getCount() {
        return imageThumbs.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if(convertView == null){
            imageView = new ImageView(imageContext);
            imageView.setLayoutParams(new GridView.LayoutParams(750,750));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(5,5,5,5);
        }else{
            imageView = (ImageView) convertView;

        }
        imageView.setImageResource(imageThumbs[position]);
        return imageView;
    }

    // Image Array

    public Integer[] imageThumbs = {R.drawable.car1, R.drawable.car2, R.drawable.car3, R.drawable.car4, R.drawable.car5, R.drawable.car6,
    R.drawable.car7, R.drawable.car8, R.drawable.car8, R.drawable.car9, R.drawable.car11, R.drawable.car12,
    R.drawable.car13, R.drawable.car14, R.drawable.car15};
}
