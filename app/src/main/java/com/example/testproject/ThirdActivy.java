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

public class ThirdActivy extends AppCompatActivity {
    Button button3, prov;
    RadioGroup redioGroup;
    RadioButton radioButton;
    TextView textView;
    public static int answer3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        redioGroup = findViewById(R.id.radioGroup);

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = redioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                if (radioButton.getText().equals("Логирование")){
                    answer3 = 1;
                }
                Intent intent = new Intent(ThirdActivy.this, FourthActivity.class);
                startActivity(intent);
            }
        });
    }

}
