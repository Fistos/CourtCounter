package com.example.tih.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayforTeamA(0);
    }

    /**
     * team A
     */
    public void addThreeForTeamA(View v) {

        scoreTeamA = scoreTeamA + 3;
        displayforTeamA(scoreTeamA);
    }

    /**
     * teamA increases score
     */
    public void addTwoForTeamA(View v) {

        scoreTeamA = scoreTeamA + 2;
        displayforTeamA(scoreTeamA);
    }

    /**
     * teamA increases score
     */
    public void addFreethrowForTeamA(View v) {

        scoreTeamA = scoreTeamA + 1;
        displayforTeamA(scoreTeamA);
    }

    /** TEAM B*/
    public void addFreethrowForTeamB(View v){

        scoreTeamB = scoreTeamB + 1;
        displayforTeamB(scoreTeamB);

    }
    public void addTwoForTeamB(View v){

        scoreTeamB = scoreTeamB + 2;
        displayforTeamB(scoreTeamB);

    }
    public void addThreeForTeamB(View v){

        scoreTeamB = scoreTeamB + 1;
        displayforTeamB(scoreTeamB);

    }

    public void reset_btn(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayforTeamA(scoreTeamA);
        displayforTeamB(scoreTeamB);


    }



    public void displayforTeamA(int score){

            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            scoreView.setText(String.valueOf(score));
        }
    public void displayforTeamB(int score){

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
