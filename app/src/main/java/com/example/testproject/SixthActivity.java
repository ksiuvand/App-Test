package com.example.testproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SixthActivity extends AppCompatActivity {
    TextView itog;
    String s;
    int itogo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        itogo = MainActivity.answer1 + SecondActivitz.answer2 + ThirdActivy.answer3 + FourthActivity.answer4 + FifthActivity.answer5;
        itog = findViewById(R.id.text6);
        if (itogo == 1){
            s = itogo + " балл из 5";
        }
        else if (itogo > 1 && itogo < 5){
            s = itogo + " балла из 5";
        }
        else{
            s = itogo + " баллов из 5";
        }
        itog.setText(s);

    }
}
