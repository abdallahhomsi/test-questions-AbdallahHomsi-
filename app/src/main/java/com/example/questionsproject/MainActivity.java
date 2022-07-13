package com.example.questionsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup answers_rg1 = findViewById(R.id.answers1);
        Button btn_moveto2 = findViewById(R.id.moveto2);

        answers_rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.p1ans1:
                    case R.id.p1ans3:
                    case R.id.p1ans4:
                        Toast.makeText(getBaseContext(),"اختر اجابة صحيحة",Toast.LENGTH_SHORT).show();
                        btn_moveto2.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.p1ans2:
                        Toast.makeText(getBaseContext(),"اجابة صحيحة",Toast.LENGTH_SHORT).show();
                        btn_moveto2.setVisibility(View.VISIBLE);
                        answers_rg1.setClickable(false);
                }
            }
        });

        btn_moveto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this , screen2.class);
                startActivity(intent1);
                finish();
            }
        });

    }



}