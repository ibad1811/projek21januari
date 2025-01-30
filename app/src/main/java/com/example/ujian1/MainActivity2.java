package com.example.ujian1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Pastikan layout ini benar

        // Temukan button menggunakan ID
        Button detailButton = findViewById(R.id.detailButton2);
        detailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke SecondActivity
                Intent intent = new Intent(MainActivity2.this, SecondActivity2.class);
                startActivity(intent); // Memulai SecondActivity
            }
        });
    }
}
