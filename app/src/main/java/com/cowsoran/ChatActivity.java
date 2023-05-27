package com.cowsoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ChatActivity extends AppCompatActivity {

    private Button btnChat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        btnChat = findViewById(R.id.btnBackChat);
        btnChat.setOnClickListener(V -> {
            Intent back = new Intent(ChatActivity.this, HomeActivity.class);
            startActivity(back);
            finish();
        });
    }
}