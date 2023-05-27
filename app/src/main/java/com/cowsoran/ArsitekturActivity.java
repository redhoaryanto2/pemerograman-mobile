package com.cowsoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ArsitekturActivity extends AppCompatActivity {

    private ImageView ivBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arsitektur);

        ivBack = findViewById(R.id.ivBackArsitektur);

        ivBack.setOnClickListener(V -> {
            Intent back = new Intent(ArsitekturActivity.this, HomeActivity.class);
            startActivity(back);
            finish();
        });
    }
}