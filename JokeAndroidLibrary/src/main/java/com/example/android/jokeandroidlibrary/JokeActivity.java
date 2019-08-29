package com.example.android.jokeandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class JokeActivity extends AppCompatActivity {

    private final static String JOKE_KEY = "joke";

    private TextView jokeTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        jokeTextview = findViewById(R.id.joke_textview);

        if (getIntent() != null) {
            if (getIntent().hasExtra(JOKE_KEY)) {
                jokeTextview.setText(getIntent().getStringExtra(JOKE_KEY));
            }
        }
    }
}
