package com.hsd.codelab.xian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.hsd.codelab.xian.advancedlevel.ArCombineActivity;
import com.hsd.codelab.xian.advancedlevel.VoiceTranslateActivity;
import com.hsd.codelab.xian.mediumlevel.ArMeshActivity;
import com.hsd.codelab.xian.mediumlevel.PushMessageActivity;

public class AdvancedLevelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
    }

    public void arCombine(View view) {
        startActivity(new Intent(AdvancedLevelActivity.this, ArCombineActivity.class));
    }

    public void voiceTranslate(View view) {
        startActivity(new Intent(AdvancedLevelActivity.this, VoiceTranslateActivity.class));
    }
}
