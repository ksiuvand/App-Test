package com.example.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FifthActivity extends AppCompatActivity {
    Button button5;
    Spinner spinner;
    public static int answer5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<?> adapter = ArrayAdapter.createFromResource(FifthActivity.this, R.array.Spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] array = getResources().getStringArray(R.array.Spinner);
                String s = array[position];
                if (s.equals("Наследование")){
                    answer5 = 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FifthActivity.this, SixthActivity.class);
                startActivity(intent);
            }
        });
    }
}
