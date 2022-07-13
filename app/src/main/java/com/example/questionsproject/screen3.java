package com.example.questionsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

         RadioGroup answers_rg3= findViewById(R.id.answers3);
         Button finish_btn=findViewById(R.id.finish);
         RadioButton p3ans1=findViewById(R.id.p3ans1);
         RadioButton p3ans2=findViewById(R.id.p3ans2);
         RadioButton p3ans3=findViewById(R.id.p3ans3);

         answers_rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup radioGroup, int i) {
                 switch(i){
                     case R.id.p3ans1:
                     case R.id.p3ans2:
                     case R.id.p3ans3:
                         Toast.makeText(getBaseContext(),"اختر اجابة صحيحة",Toast.LENGTH_SHORT).show();
                         finish_btn.setVisibility(View.INVISIBLE);
                         break;
                     case R.id.p3ans4: finish_btn.setVisibility(View.VISIBLE);
                     answers_rg3.setClickable(false);
                     Toast.makeText(getBaseContext()," اجابة صحيحة",Toast.LENGTH_SHORT).show();

                 }
             }
         });

         finish_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent3 = new Intent(screen3.this,finish_screen.class);
                 startActivity(intent3);
                 finish();

             }
         });



    }
}
