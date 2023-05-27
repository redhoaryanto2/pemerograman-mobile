package com.cowsoran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ShowableListMenu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    private ImageView ivBack, ivTukang, ivChat, ivDesainInterior, ivArsitek, ivFurniture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ivBack = findViewById(R.id.ivBackHome);

        ivTukang = findViewById(R.id.ivTukang);

        ivChat = findViewById(R.id.ivChat);

        ivDesainInterior = findViewById(R.id.ivDesainInterior);

        ivArsitek = findViewById(R.id.ivArtsitektur);

        ivFurniture = findViewById(R.id.ivInterior);

        ivFurniture.setOnClickListener(V -> {
            Intent interior  = new Intent(HomeActivity.this, FurnitureActivity.class);
            startActivity(interior);
            finish();
        });

        ivArsitek.setOnClickListener(V -> {
            Intent arsitek = new Intent(HomeActivity.this, ArsitekturActivity.class);
            startActivity(arsitek);
            finish();
        });

        ivDesainInterior.setOnClickListener(V -> {
            Intent desain = new Intent(HomeActivity.this, DesainInteriorActivity.class);
            startActivity(desain);
            finish();
        });

        ivChat.setOnClickListener(V -> {
            Intent chat = new Intent(HomeActivity.this, ChatActivity.class);
            startActivity(chat);
            finish();
        });

        ivTukang.setOnClickListener(V -> {
            Intent tukang = new Intent(HomeActivity.this, TukangActivity.class);
            startActivity(tukang);
            finish();
        });

        ivBack.setOnClickListener(V -> {
            Intent back = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(back);
            finish();
        });
    }
}