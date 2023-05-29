package com.vivek.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button genRandom;
        TextView result;

        genRandom = findViewById(R.id.genRandom);
        result = findViewById(R.id.result);

        genRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = (int)(Math.random()*100);
                result.setText("Random Number is "+Integer.toString(num));
            }
        });

    }
}