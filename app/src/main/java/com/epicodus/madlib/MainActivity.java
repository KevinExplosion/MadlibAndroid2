package com.epicodus.madlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private EditText mAdj1;
    private EditText mAdj2;
    private EditText mAdj3;
    private EditText mAdverb;
    private EditText mNoun1;
    private EditText mNoun2;
    private EditText mNoun3;
    private EditText mNoun4;
    private EditText mNoun5;
    private EditText mNoun6;
    private EditText mPluralNoun;
    private Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdj1 = (EditText) findViewById(R.id.adj1);
        mAdj2 = (EditText) findViewById(R.id.adj2);
        mAdj3 = (EditText) findViewById(R.id.adj3);
        mAdverb = (EditText) findViewById(R.id.adverb);
        mNoun1 = (EditText) findViewById(R.id.noun1);
        mNoun2 = (EditText) findViewById(R.id.noun2);
        mNoun3 = (EditText) findViewById(R.id.noun3);
        mNoun4 = (EditText) findViewById(R.id.noun4);
        mNoun5 = (EditText) findViewById(R.id.noun5);
        mNoun6 = (EditText) findViewById(R.id.noun6);
        mPluralNoun = (EditText) findViewById(R.id.pluralNoun);

        mSubmitButton = (Button) findViewById(R.id.submitButton);
            mSubmitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String adj1 = mAdj1.getText().toString();
                    String adj2 = mAdj2.getText().toString();
                    String adj3 = mAdj3.getText().toString();
                    String adverb = mAdverb.getText().toString();
                    String noun1 = mNoun1.getText().toString();
                    String noun2 = mNoun2.getText().toString();
                    String noun3 = mNoun3.getText().toString();
                    String noun4 = mNoun4.getText().toString();
                    String noun5 = mNoun5.getText().toString();
                    String noun6 = mNoun6.getText().toString();
                    String pluralNoun = mPluralNoun.getText().toString();
                    Log.d(TAG, adj1);
                    Log.d(TAG, adj2);
                    Intent intent = new Intent(MainActivity.this, MadlibActivity.class);
                    intent.putExtra("adj1", adj1);
                    intent.putExtra("adj2", adj2);
                    intent.putExtra("adj3", adj3);
                    intent.putExtra("adverb", adverb);
                    intent.putExtra("noun1", noun1);
                    intent.putExtra("noun2", noun2);
                    intent.putExtra("noun3", noun3);
                    intent.putExtra("noun4", noun4);
                    intent.putExtra("noun5", noun5);
                    intent.putExtra("noun6", noun6);
                    intent.putExtra("pluralNoun", pluralNoun);
                    startActivity(intent);
                }
            });
    }
}
