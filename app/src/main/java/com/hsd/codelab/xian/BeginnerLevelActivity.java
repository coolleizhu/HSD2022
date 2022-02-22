package com.hsd.codelab.xian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.hsd.codelab.xian.beginnerlevel.AccountLoginActivity;
import com.hsd.codelab.xian.beginnerlevel.AudioEditorActivity;
import com.hsd.codelab.xian.beginnerlevel.CodeScannerActivity;
import com.hsd.codelab.xian.beginnerlevel.LocationDisplayActivity;
import com.hsd.codelab.xian.beginnerlevel.PushTokenActivity;
import com.hsd.codelab.xian.beginnerlevel.VideoEditorActivity;

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

    public void locationDisplay(View view) {
        startActivity(new Intent(BeginnerLevelActivity.this, LocationDisplayActivity.class));
    }

    public void getPushToken(View view) {
        startActivity(new Intent(BeginnerLevelActivity.this, PushTokenActivity.class));
    }

    public void editAudio(View view) {
        startActivity(new Intent(BeginnerLevelActivity.this, AudioEditorActivity.class));
    }

    public void editVideo(View view) {
        startActivity(new Intent(BeginnerLevelActivity.this, VideoEditorActivity.class));
    }
}
