package com.cowsoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin, btnDaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btn_sign_in);

        btnDaftar =  findViewById(R.id.btn_sign_up);

        btnLogin.setOnClickListener(V -> {
            Intent login = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(login);
            finish();
        });

        btnDaftar.setOnClickListener(V -> {
            Intent daftar = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(daftar);
            finish();
        });
    }
}