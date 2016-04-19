package com.epicodus.madlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MadlibActivity extends AppCompatActivity {
    public static final String TAG = MadlibActivity.class.getSimpleName();
    private TextView mLocationTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlib);

        mLocationTextView = (TextView) findViewById(R.id.madlibresult);

        Intent intent = getIntent();
        String adj1 = intent.getStringExtra("adj1");
        String adj2 = intent.getStringExtra("adj2");
        String adj3 = intent.getStringExtra("adj3");
        String adverb = intent.getStringExtra("adverb");
        String noun1 = intent.getStringExtra("noun1");
        String noun2 = intent.getStringExtra("noun2");
        String noun3 = intent.getStringExtra("noun3");
        String noun4 = intent.getStringExtra("noun4");
        String noun5 = intent.getStringExtra("noun5");
        String noun6 = intent.getStringExtra("noun6");
        String pluralNoun = intent.getStringExtra("pluralNoun");
        mLocationTextView.setText("Driving a car can be fun if you follow this " +adj1+ " advice: "
                + "When approaching a "+noun1+" on the right, always blow your " +noun2+ ". Before making a "
                +adj2+ " turn, always stick your " +noun3+ " out of the window. "+
                "Every 2000 miles, have your " +noun4+ " inspected and your "
                +noun5+ " checked. When approaching a school, watch out for " +adj3+" "+pluralNoun+ ". Above all, " +
                "drive " +adverb+ ". The " +noun6+ " you save may be your own!");
    }
}
