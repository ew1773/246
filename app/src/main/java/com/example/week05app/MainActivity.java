package com.example.week05app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    public final static String USER_BOOK = "com.example.week05app.BOOK";
    public final static String USER_CHAPTER = "com.example.week05app.CHAPTER";
    public final static String USER_VERSE = "com.example.week05app.VERSE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void sendInfo(View view) {
            Intent intent = new Intent(this, DisplayInfo.class);
            EditText editText = (EditText) findViewById(R.id.user_book);
            EditText editText1 = (EditText) findViewById(R.id.user_chapter);
            EditText editText2 = (EditText) findViewById(R.id.user_verse);
            String book = editText.getText().toString();
            String chapter = editText1.getText().toString();
            String verse = editText2.getText().toString();

            Bundle b = new Bundle();

            b.putString(USER_BOOK, book);
            b.putString(USER_CHAPTER, chapter);
            b.putString(USER_VERSE, verse);

            intent.putExtras(b);
            startActivity(intent);

    }

}

