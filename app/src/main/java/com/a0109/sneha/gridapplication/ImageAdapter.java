package com.a0109.sneha.gridapplication;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;

/**
 * Created by sneha on 04-10-2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
    };

    public static String[] mStrings={"Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic","Hoda Civic",

    };
    public  static String[] Sites={"https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic","https://www.zigwheels.com/newcars/Honda/civic"

    };

    // Constructor
    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        TextView textView = new TextView(mContext);
        textView.setText(mStrings[position]);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
        return imageView;
    }

}
