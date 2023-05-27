package com.cowsoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class DesainInteriorActivity extends AppCompatActivity {

    private ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desain_interior);

        ivBack = findViewById(R.id.ivBackDesain);

        ivBack.setOnClickListener(V -> {
            Intent back = new Intent(DesainInteriorActivity.this, HomeActivity.class);
            startActivity(back);
            finish();
        });
    }
}