package com.example.counttheblessings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt_count;
    Button btn_reset, btn_blessing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    public void findViews(){
        txt_count = findViewById(R.id.txt_count);
        btn_blessing = findViewById(R.id.btn_blessing);
        btn_reset = findViewById(R.id.btn_reset);
    }
}