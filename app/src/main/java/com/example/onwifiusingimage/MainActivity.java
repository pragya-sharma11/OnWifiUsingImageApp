package com.example.onwifiusingimage;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private boolean wifi = false;
    ImageButton i;
    WifiManager wf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i = findViewById(R.id.imageButton);
        wf = (WifiManager)getApplicationContext().getSystemService(WIFI_SERVICE);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if()
            }
        });
    }
}