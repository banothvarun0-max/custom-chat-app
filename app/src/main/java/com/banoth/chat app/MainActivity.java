package com.banoth.chatapp;
import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        TextView txt = new TextView(this);
        txt.setText("🎉 Welcome to Banoth Varun Custom Chat App!");
        txt.setTextSize(24.0f);
        layout.addView(txt);
        setContentView(layout);
    }
}

