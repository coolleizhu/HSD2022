package com.hsd.codelab.xian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.hsd.codelab.xian.beginnerlevel.AccountLoginActivity;
import com.hsd.codelab.xian.beginnerlevel.AdsDisplayActivity;
import com.hsd.codelab.xian.beginnerlevel.CodeScannerActivity;

public class BeginnerLevelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);
    }

    public void accountLogin(View view) {
        startActivity(new Intent(BeginnerLevelActivity.this, AccountLoginActivity.class));
    }

    public void codeScanner(View view) {
        startActivity(new Intent(BeginnerLevelActivity.this, CodeScannerActivity.class));
    }

    public void adsDisplay(View view) {
        startActivity(new Intent(BeginnerLevelActivity.this, AdsDisplayActivity.class));
    }
}
