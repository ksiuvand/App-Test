package com.example.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {
    Button button4;
    RadioGroup redioGroup2;
    RadioButton radioButton2;
    public static int answer4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        redioGroup2 = findViewById(R.id.radioGroup2);


        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = redioGroup2.getCheckedRadioButtonId();
                radioButton2 = findViewById(radioId);
                if (radioButton2.getText().equals("Верно")){
                    answer4 = 1;
                }
                Intent intent = new Intent(FourthActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });
    }
}
