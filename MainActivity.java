package com.example.umpire_buddy;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView showValue;
    int strikes = 0;
    int balls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        showValue = (TextView) findViewById(R.id.strikeCount);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callStrike(View view) {
        strikes++;
        showValue.setText(Integer.toString(strikes));
    }

    public void callBall(View view) {
        balls++;
        showValue.setText(Integer.toString(balls));
    }

    public void resetCount (View view) {
        strikes = 0;
        balls = 0;
        showValue.setText(String.valueOf(strikes));
        showValue.setText((String.valueOf(balls)));
    }

}
