package com.cowsoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class TukangActivity extends AppCompatActivity {

    private ImageView ivBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tukang);

        ivBack = findViewById(R.id.ivBackTukang);

        ivBack.setOnClickListener(V -> {
            Intent back = new Intent(TukangActivity.this, HomeActivity.class);
            startActivity(back);
            finish();
        });
    }
}