package com.example.counttheblessings;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt_count;
    Button btn_reset, btn_blessing;
    public int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        animation();
        buttonBlessing();
        buttonReset();
    }
    public void findViews(){
        txt_count = findViewById(R.id.txt_count);
        btn_blessing = findViewById(R.id.btn_blessing);
        btn_reset = findViewById(R.id.btn_reset);
    }
    public void animation(){
        Animation txt_count_Animation = AnimationUtils.loadAnimation(this,R.anim.alpha_animation);
        Animation btn_blessing_Animation = AnimationUtils.loadAnimation(this,R.anim.trans_left_animation);
        Animation btn_reset_Animation = AnimationUtils.loadAnimation(this,R.anim.trans_right_animation);

        txt_count.setAnimation(txt_count_Animation);
        btn_blessing.setAnimation(btn_blessing_Animation);
        btn_reset.setAnimation(btn_reset_Animation);
    }
    public void resultCounter(){
        counter+=1;
    }
    public void buttonBlessing(){
     btn_blessing.setOnClickListener(new View.OnClickListener() {
         @SuppressLint("SetTextI18n")
         @Override
         public void onClick(View view) {
            resultCounter();
            txt_count.setText(counter+"");
         }
     });
    }
   public void buttonReset(){
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                counter=0;
                txt_count.setText(counter+"");
            }
        });
   }
}