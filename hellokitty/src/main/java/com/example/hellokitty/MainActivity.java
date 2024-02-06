package com.example.hellokitty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvName1;

    private EditText edName1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName1 = findViewById(R.id.textView);
        edName1 = findViewById(R.id.editTextText);
    }

    public void onClick(View view){
    if (edName1.getText().length() == 0){
        tvName1.setText("Покеда");
    } else {
        tvName1.setText("Привет, " + edName1.getText());
    }

   // tvName1.setText("Hello Kitty!");
    }
}