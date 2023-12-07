package com.tuhin.fitguard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button loginbutton;
    private EditText editTextGender,editTextDate,editTextHeight, editTextWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        setVarible();

    }


    private void setVarible(){
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextGender.getText().toString().trim().isEmpty() || editTextDate.getText().toString().trim().isEmpty() || editTextHeight.getText().toString().trim().isEmpty() || editTextWeight.getText().toString().trim().isEmpty()){
                    Toast.makeText(LoginActivity.this,"Please Fill the Login form", Toast.LENGTH_SHORT).show();
                }else{
                    Intent log = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(log);
                    finish();
                }
            }
        });
    }
    private void initView(){
        loginbutton = findViewById(R.id.loginbutton);
        editTextGender = findViewById(R.id.editTextGender);
        editTextDate = findViewById(R.id.editTextDate);
        editTextHeight = findViewById(R.id.editTextHeight);
        editTextWeight = findViewById(R.id.editTextWeight);
    }
}