package com.example.friday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnOk;

    Button btnCnl;
    TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOk = findViewById(R.id.btnOK);
        btnCnl = findViewById(R.id.btnCANCEL);
        tvText = findViewById(R.id.Tixt);
        btnOk.setOnClickListener(oclBtnOK);
        btnCnl.setOnClickListener(oclBtnCancel);
    }

    View.OnClickListener oclBtnOK = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            tvText.setText("Нажата кнопка ОК по второму методу");
        }
    };
    View.OnClickListener oclBtnCancel = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            tvText.setText("Нажата кнопка Cancel по второму методу");
        }
    };

}