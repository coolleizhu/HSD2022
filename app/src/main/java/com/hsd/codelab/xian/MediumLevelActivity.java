package com.hsd.codelab.xian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.hsd.codelab.xian.mediumlevel.TextTranslateActivity;
import com.hsd.codelab.xian.mediumlevel.MlReadActivity;
import com.hsd.codelab.xian.mediumlevel.KeyringLoginActivity;

public class MediumLevelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);
    }

    public void keyringlogin(View view) {
        startActivity(new Intent(MediumLevelActivity.this, KeyringLoginActivity.class));
    }

    public void textTranslate(View view) {
        startActivity(new Intent(MediumLevelActivity.this, TextTranslateActivity.class));
    }

    public void mlRead(View view) {
        startActivity(new Intent(MediumLevelActivity.this, MlReadActivity.class));
    }
}
