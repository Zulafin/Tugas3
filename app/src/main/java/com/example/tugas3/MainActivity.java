package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.kampusMerdeka);
        btn2 = findViewById(R.id.ruangGuru);
        btn3 = findViewById(R.id.mobile);
        btn4 = findViewById(R.id.game);

        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, KampusMerdekaActivity.class);
            startActivity(intent);
        });

        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RuangGuruActivity.class);
            startActivity(intent);
        });

        btn3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PemrogramanMobileActivity.class);
            startActivity(intent);
        });

        btn4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PemrogramanGameActivity.class);
            startActivity(intent);
        });
    }
}