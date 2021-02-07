package com.example.mobilepractice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mobilepractice2.R;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_index);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        TextView usernameView = findViewById(R.id.usernameInIndex);
        usernameView.setText(username);
    }
}