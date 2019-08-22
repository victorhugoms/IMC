package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView textViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        textViewInfo = findViewById(R.id.text_view_info);

        Intent intent = getIntent();
        String mensagem = intent.getStringExtra("RESULTADO");
        textViewInfo.setText(mensagem);
    }
}
