package com.example.fintechtaiksprendimai;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonText;
    Button buttonChangeColor;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.txtTextDisplay);

        buttonText = (Button) findViewById(R.id.btnInputText);
        buttonText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Deprecated, but to make it slightly more responsive its more than enough
                //Provides 24H time format
                //Source: https://stackoverflow.com/questions/5369682/how-to-get-current-time-and-date-in-android second upvote (499)
                Time now = new Time();
                now.setToNow();

                if (now.hour < 13) {
                    tv.setText("Labas rytas");
                }

                if (now.hour >= 13 && now.hour < 17) {
                    tv.setText("Laba diena");
                }

                if (now.hour >= 17) {
                    tv.setText("Labas vakaras");
                }
            }
        });

        buttonChangeColor = (Button) findViewById(R.id.btnChangeTextColor);
        buttonChangeColor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setTextColor(Color.RED);
            }
        });
    }
}