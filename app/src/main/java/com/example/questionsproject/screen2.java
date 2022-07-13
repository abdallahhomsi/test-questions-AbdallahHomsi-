package com.example.questionsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        RadioGroup answers_rg2=findViewById(R.id.answers2);
        Button btn_moveto3=findViewById(R.id.moveto3);

        answers_rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.p2ans1:
                    case R.id.p2ans2:
                    case R.id.p2ans4:
                        Toast.makeText(getBaseContext(),"اختر اجابة صحيحة",Toast.LENGTH_SHORT).show();
                        btn_moveto3.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.p2ans3:btn_moveto3.setVisibility(View.VISIBLE);
                    answers_rg2.setClickable(false);
                    Toast.makeText(getBaseContext()," اجابة صحيحة",Toast.LENGTH_SHORT).show();

                }
            }
        });

        btn_moveto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(screen2.this, screen3.class );
                startActivity(intent2);
                finish();
            }
        });
    }




}