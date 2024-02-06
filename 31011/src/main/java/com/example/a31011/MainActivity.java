package com.example.a31011;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView myText;
    private CheckBox myCheckBox;
    private Button myButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        myText = findViewById(R.id.tvMyText);
        myText.setText("New text in TextView");
        myCheckBox = findViewById(R.id.cbMyCheckBox);
        myCheckBox.setChecked(true);
        myButton = findViewById(R.id.btnMyButton);
        myButton.setEnabled(false);
    }
}