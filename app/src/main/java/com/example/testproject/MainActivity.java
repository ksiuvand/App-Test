package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox var1, var2, var3, var4;
    int res1, res2, res3, res4;
    public static int answer1;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        var1 = findViewById(R.id.check_var1);
        var2 = findViewById(R.id.check_var2);
        var3 = findViewById(R.id.check_var3);
        var4 = findViewById(R.id.check_var4);


        var1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (var1.isChecked())
                    res1 = 1;
            }
        });
        var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (var2.isChecked())
                    res2 = 1;
            }
        });
        var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (var3.isChecked())
                    res3 = 1;
            }
        });

        var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (var4.isChecked())
                    res4 = 1;
            }
        });


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res1 == 1 && res4 == 1 && res3 == 1 && res2 != 1){
                    answer1 = 1;
                }
                Intent intent = new Intent(MainActivity.this, SecondActivitz.class);
                startActivity(intent);
            }
        });
    }
}