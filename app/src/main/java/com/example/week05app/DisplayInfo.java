package com.example.week05app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;


public class DisplayInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        Bundle b = getIntent().getExtras();
        String book = b.getString(MainActivity.USER_BOOK);
        String chapter = b.getString(MainActivity.USER_CHAPTER);
        String verse = b.getString(MainActivity.USER_VERSE);
        String message = "Your favorite scripture is: " + book + " " + chapter + ":" + verse;
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_info);
        layout.addView(textView);
    }
}
