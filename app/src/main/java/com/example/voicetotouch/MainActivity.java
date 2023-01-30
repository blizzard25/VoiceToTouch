package com.example.voicetotouch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startServiceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startServiceButton = findViewById(R.id.start_service_button);
        startServiceButton.setOnClickListener(v -> {
            startTouchInputService();
            hideUserInterface();
        });
    }

    private void startTouchInputService() {
        //Intent intent = new Intent(this, TouchInputService.class);
        //startService(intent);
    }

    private void hideUserInterface() {
        startServiceButton.setVisibility(View.GONE);
    }
}