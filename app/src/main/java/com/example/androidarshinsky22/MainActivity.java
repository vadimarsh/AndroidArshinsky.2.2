package com.example.androidarshinsky22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static int generateNumber() {
        Random random = new Random();
        return (random.nextInt(100) + 1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.textView)).setText(getString(R.string.url) + generateNumber());
        findViewById(R.id.buttonForvard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
        findViewById(R.id.buttonBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.finish();
            }
        });
    }
}
