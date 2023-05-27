package com.cowsoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class RegistrasiActivity extends AppCompatActivity {

    private Button btnDaftar;
    private ImageView ivBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        btnDaftar = findViewById(R.id.btnDaftar);

        ivBack = findViewById(R.id.ivBackRegis);

        ivBack.setOnClickListener(V -> {
            Intent back = new Intent(RegistrasiActivity.this, MainActivity.class);
            startActivity(back);
            finish();
        });

        btnDaftar.setOnClickListener(V -> {
            Intent daftar = new Intent(RegistrasiActivity.this, HomeActivity.class);
            startActivity(daftar);
            finish();
        });
    }
}