package com.tuhin.fitguard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WaterActivity extends AppCompatActivity {

    Button waterbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);

        waterbutton = findViewById(R.id.waterbutton);

        waterbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginb = new Intent(WaterActivity.this, LoginActivity.class);
                //Intent waterintent = new Intent(WaterActivity.this, LoginActivity.class);
                startActivity(loginb);
                finish();
            }
        });
    }
}