package com.cowsoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private ImageView ivBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);

        ivBack = findViewById(R.id.ivBackLogin);

        ivBack.setOnClickListener(V -> {
            Intent back = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(back);
            finish();

        });

        btnLogin.setOnClickListener(V -> {
            Intent  login = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(login);
            finish();
        });
    }
}