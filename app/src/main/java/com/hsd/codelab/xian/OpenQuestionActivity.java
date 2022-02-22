package com.hsd.codelab.xian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.hsd.codelab.xian.advancedlevel.ObjectModelingActivity;

public class OpenQuestionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openquestion);
    }

    public void objectModeling(View view) {
        startActivity(new Intent(OpenQuestionActivity.this, ObjectModelingActivity.class));
    }

}
