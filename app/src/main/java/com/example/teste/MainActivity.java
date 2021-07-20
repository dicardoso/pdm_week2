package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt_info, txt_feedback;
    private Button btn_sobre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txt_info = findViewById(R.id.txt_info);
        this.txt_feedback = findViewById(R.id.txt_feedback);
        this.btn_sobre = findViewById(R.id.btn_sobre);

        this.txt_info.setText(Build.MODEL);
        this.btn_sobre.setOnClickListener(view -> {
            this.txt_feedback.setText("modelo do dispositivo");
        });
    }
}