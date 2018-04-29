package com.ultrarate.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreA = 0;
    int scoreB = 0;

    private void initializeText(int value)
    {
        TextView textview = findViewById(R.id.team_a_text);
        scoreA += value;
        textview.setText(String.valueOf(scoreA));
    }

    private void initializeTextB(int value)
    {
        TextView textView = findViewById(R.id.team_b_text);
        scoreB += value;
        textView.setText(String.valueOf(scoreB));
    }

    public void display3BScore(View view)
    {
        initializeTextB(3);
    }

    public void display2BScore(View view)
    {
        initializeTextB(2);
    }

    public void displayBScore(View view)
    {
        initializeTextB(1);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void display3AScore(View view)
    {
        initializeText(3);
    }

    public void display2AScore(View view)
    {
        initializeText(2);
    }

    public void displayAScore(View view)
    {
        initializeText(1);
    }


    public void ResetButton(View view)
    {
        scoreA = 0;
        scoreB = 0;
        initializeText(0);
        initializeTextB(0);
    }



}
