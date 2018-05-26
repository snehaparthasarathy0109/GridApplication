package com.a0109.sneha.gridapplication;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;

import static com.a0109.sneha.gridapplication.R.styleable.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView) findViewById(R.id.gridview);

        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));
        registerForContextMenu(gridView);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Sending image id to FullScreenActivity
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onContextItemSelected(android.view.MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int index = info.position; //Use this for getting the list item value
        View view = info.targetView;
        switch(item.getItemId()) {
            case R.id.ShowImage:
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(ImageAdapter.Sites[info.position]));
                startActivity(intent);
                return true;

            case R.id.ShowWebsite:
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                // passing array index
                i.putExtra("id", info.position);
                startActivity(i);
                return true;

            case R.id.ShowDealers:
                Intent in = new Intent(MainActivity.this, Dealers.class);
                // passing array index
                in.putExtra("id", info.position);
                startActivity(in);
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }

}
