package com.example.umpire_buddy;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView showStrikes = findViewById(R.id.strikeCount);
    TextView showBalls = findViewById(R.id.ballCount);

    int strikes = 0;
    int balls = 0;


    Button btn1 = findViewById(R.id.strikeButton);
    Button btn2 = findViewById(R.id.ballButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        showStrikes = findViewById(R.id.strikeCount);
        showBalls = findViewById(R.id.ballCount);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callStrike(View view) {

        strikes++;
        showStrikes.setText(Integer.toString(strikes));
        if (strikes > 2) {
            btn1.setEnabled(false);
            btn2.setEnabled(false);
        }
    }

    public void callBall(View view) {
        balls++;
        showBalls.setText(Integer.toString(balls));
        if (balls > 3) {
            btn2.setEnabled(false);
            btn1.setEnabled(false);
        }
    }

    public void resetCount (View view) {
        strikes = 0;
        balls = 0;
        showStrikes.setText(String.valueOf(strikes));
        showBalls.setText((String.valueOf(balls)));
    }

    public void showAbout (View view) {
        showStrikes.setText("Umpire Buddy 2.0");
        showBalls.setText("Zach Kitchen");
    }

}
