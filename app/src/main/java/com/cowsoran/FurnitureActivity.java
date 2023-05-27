package com.cowsoran;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FurnitureActivity extends AppCompatActivity {

    private ImageView ivBack;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture);

        ivBack = findViewById(R.id.ivBackFurniture);

        ivBack.setOnClickListener(V -> {
            Intent back = new Intent(FurnitureActivity.this, HomeActivity.class);
            startActivity(back);
            finish();
        });
    }
}