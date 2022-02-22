package com.hsd.codelab.xian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void beginnerLevel(View view) {
        startActivity(new Intent(MainActivity.this, BeginnerLevelActivity.class));
    }
    public void mediumLevel(View view) {
        startActivity(new Intent(MainActivity.this, MediumLevelActivity.class));
    }
    public void openQuestion(View view) {
        startActivity(new Intent(MainActivity.this, OpenQuestionActivity.class));
    }
}