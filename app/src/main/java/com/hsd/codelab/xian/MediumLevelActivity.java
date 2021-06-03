package com.hsd.codelab.xian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.hsd.codelab.xian.mediumlevel.ArMeshActivity;
import com.hsd.codelab.xian.mediumlevel.MlSegActivity;
import com.hsd.codelab.xian.mediumlevel.PushMessageActivity;

public class MediumLevelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);
    }

    public void pushMessage(View view) {
        startActivity(new Intent(MediumLevelActivity.this, PushMessageActivity.class));
    }

    public void arMesh(View view) {
        startActivity(new Intent(MediumLevelActivity.this, ArMeshActivity.class));
    }

    public void mlSeg(View view) {
        startActivity(new Intent(MediumLevelActivity.this, MlSegActivity.class));
    }
}
