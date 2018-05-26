
package com.a0109.sneha.gridapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sneha on 04-10-2017.
 */

public class SecondActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        // get intent data
        Intent i = getIntent();

        // Selected image id
        final int position = i.getExtras().getInt("id");
        final ImageAdapter imageAdapter = new ImageAdapter(this);
        TextView textView = (TextView) findViewById(R.id.textView1);
        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);
        imageView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(imageAdapter.Sites[position]));
                startActivity(intent);
            }
        });
    }
}
