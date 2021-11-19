package com.example.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivitz extends AppCompatActivity {
    public int num2;
    public static int answer2;

    Button button2;
    EditText edittxt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edittxt = findViewById(R.id.edit_text);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answ = edittxt.getText().toString();
                if (answ.equals("s1")){
                    answer2 = 1;
                }
                Intent intent = new Intent(SecondActivitz.this, ThirdActivy.class);
                startActivity(intent);
            }
        });
    }

}
