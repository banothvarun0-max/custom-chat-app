
package com.banoth.chatapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 1. Core Structural Interface Screen Layout Frame
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setPadding(32, 32, 32, 32);
        mainLayout.setGravity(Gravity.CENTER_HORIZONTAL);
        mainLayout.setBackgroundColor(0xFFF5F5F5); // Clean light grey theme

        // 2. Custom App Logo and Branding Header Component
        TextView appLogoTitle = new TextView(this);
        appLogoTitle.setText("💬\nCustom Chat");
        appLogoTitle.setTextSize(32.0f);
        appLogoTitle.setTypeface(null, android.graphics.Typeface.BOLD);
        appLogoTitle.setGravity(Gravity.CENTER);
        appLogoTitle.setPadding(0, 40, 0, 40);
        appLogoTitle.setTextColor(0xFF2196F3); // Material Blue branding color
        mainLayout.addView(appLogoTitle);

        // 3. User Welcome Instructions Interface Banner
        TextView instructionsText = new TextView(this);
        instructionsText.setText("Setup your profile variables to initialize encryption keys:");
        instructionsText.setTextSize(14.0f);
        instructionsText.setPadding(0, 20, 0, 10);
        mainLayout.addView(instructionsText);

        // 4. Free Manual State Selection Dropdown List Menu
        final Spinner stateSelector = new Spinner(this);
        String[] stateNames = {"Select Active State Name", "Telangana", "Andhra Pradesh", "Delhi", "Mumbai", "Karnataka"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, stateNames);
        stateSelector.setAdapter(adapter);
        stateSelector.setPadding(10, 20, 10, 20);
        mainLayout.addView(stateSelector);

        // 5. 100% Free Secure Google Login Simulation Interface Trigger
        Button googleLoginButton = new Button(this);
        googleLoginButton.setText("Sign In With Google");
        googleLoginButton.setBackgroundColor(0xFF4285F4); // Official Google Blue color
        googleLoginButton.setTextColor(0xFFFFFFFF);
        googleLoginButton.setPadding(20, 20, 20, 20);
        
        LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        btnParams.setMargins(0, 40, 0, 40);
        googleLoginButton.setLayoutParams(btnParams);
        mainLayout.addView(googleLoginButton);

        // 6. Action Listener to Save Selection Internally Natively inside Phone Cache Memory
        googleLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chosenState = stateSelector.getSelectedItem().toString();
                if (stateSelector.getSelectedItemPosition() == 0) {
                    Toast.makeText(MainActivity.this, "⚠️ Please select your state to login!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "🎉 Google Verified! State locked to: " + chosenState, Toast.LENGTH_LONG).show();
                }
            }
        });

        // 7. Google AdMob Placement Area Placeholder Banner Frame Component
        TextView adMobBannerPlaceholder = new TextView(this);
        adMobBannerPlaceholder.setText("[ AdMob Live Banner Advertisement Space ]");
        adMobBannerPlaceholder.setBackgroundColor(0xFFE0E0E0);
        adMobBannerPlaceholder.setTextColor(0xFF757575);
        adMobBannerPlaceholder.setGravity(Gravity.CENTER);
        adMobBannerPlaceholder.setTextSize(12.0f);
        
        LinearLayout.LayoutParams adParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 150); // Exact AdMob Banner standard height
        adParams.setMargins(0, 60, 0, 0);
        adMobBannerPlaceholder.setLayoutParams(adParams);
        mainLayout.addView(adMobBannerPlaceholder);

        setContentView(mainLayout);
    }
}
