package com.a0109.sneha.gridapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by sneha on 05-10-2017.
 */

public class Dealers extends Activity {
    public static String[] mStrings = {"Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic", "Hoda Civic",

    };
    public static String[] Sites = {"4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA", "4950 S Pulaski Rd, Chicago, IL 60632, USA"

    };

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        // get intent data
        Intent i = getIntent();

        // Selected image id
        final int position = i.getExtras().getInt("id");

        switch(position){

            case 0:
                TextView textView = (TextView) findViewById(R.id.textView1);
                textView.setText(mStrings[position]);
                textView.setText(Sites[position]);

            case 1:
                TextView textView1 = (TextView) findViewById(R.id.textView1);
                textView1.setText(mStrings[position]);
                textView1.setText(Sites[position]);

            case 2:
                TextView textView2 = (TextView) findViewById(R.id.textView1);
                textView2.setText(mStrings[position]);
                textView2.setText(Sites[position]);
            case 3:
                TextView textView3 = (TextView) findViewById(R.id.textView1);
                textView3.setText(mStrings[position]);
                textView3.setText(Sites[position]);
            case 4:
                TextView textView4 = (TextView) findViewById(R.id.textView1);
                textView4.setText(mStrings[position]);
                textView4.setText(Sites[position]);
            case 5:
                TextView textView5 = (TextView) findViewById(R.id.textView1);
                textView5.setText(mStrings[position]);
                textView5.setText(Sites[position]);
            case 6:
                TextView textView6 = (TextView) findViewById(R.id.textView1);
                textView6.setText(mStrings[position]);
                textView6.setText(Sites[position]);
            case 7:
                TextView textView7 = (TextView) findViewById(R.id.textView1);
                textView7.setText(mStrings[position]);
                textView7.setText(Sites[position]);
            case 8:
                TextView textView8 = (TextView) findViewById(R.id.textView1);
                textView8.setText(mStrings[position]);
                textView8.setText(Sites[position]);
            case 9:
                TextView textView9 = (TextView) findViewById(R.id.textView1);
                textView9.setText(mStrings[position]);
                textView9.setText(Sites[position]);
            case 10:
                TextView textView10 = (TextView) findViewById(R.id.textView1);
                textView10.setText(mStrings[position]);
                textView10.setText(Sites[position]);
            case 11:
                TextView textView11 = (TextView) findViewById(R.id.textView1);
                textView11.setText(mStrings[position]);
                textView11.setText(Sites[position]);
            case 12:
                TextView textView12 = (TextView) findViewById(R.id.textView1);
                textView12.setText(mStrings[position]);
                textView12.setText(Sites[position]);
            case 13:
                TextView textView13 = (TextView) findViewById(R.id.textView1);
                textView13.setText(mStrings[position]);
                textView13.setText(Sites[position]);
            case 14:
                TextView textView14 = (TextView) findViewById(R.id.textView1);
                textView14.setText(mStrings[position]);
                textView14.setText(Sites[position]);
            case 15:
                TextView textView15 = (TextView) findViewById(R.id.textView1);
                textView15.setText(mStrings[position]);
                textView15.setText(Sites[position]);
            case 16:
                TextView textView16 = (TextView) findViewById(R.id.textView1);
                textView16.setText(mStrings[position]);
                textView16.setText(Sites[position]);
            case 17:
                TextView textView17 = (TextView) findViewById(R.id.textView1);
                textView17.setText(mStrings[position]);
                textView17.setText(Sites[position]);
            case 18:
                TextView textView18 = (TextView) findViewById(R.id.textView1);
                textView18.setText(mStrings[position]);
                textView18.setText(Sites[position]);
            case 19:
                TextView textView19 = (TextView) findViewById(R.id.textView1);
                textView19.setText(mStrings[position]);
                textView19.setText(Sites[position]);
            case 20:
                TextView textView20 = (TextView) findViewById(R.id.textView1);
                textView20.setText(mStrings[position]);
                textView20.setText(Sites[position]);
            case 21:
                TextView textView21 = (TextView) findViewById(R.id.textView1);
                textView21.setText(mStrings[position]);
                textView21.setText(Sites[position]);

        }


    }
}
