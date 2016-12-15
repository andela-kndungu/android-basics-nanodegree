package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThree(View view) {
        score += 3;
        display();
    }

    public void addTwo(View view) {
        score += 2;
        display();
    }

    public void addOne(View view) {
        score += 1;
        display();
    }

    public void display() {
        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);
        teamAScore.setText(Integer.toString(score));
    }
}
