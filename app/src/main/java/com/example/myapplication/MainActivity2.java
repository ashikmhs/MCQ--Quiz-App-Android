package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {

    RadioGroup RadioGroup;
    RadioButton RadioButton;
    Button BTN;
    int point = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int prev = intent.getIntExtra("result",0);

        RadioGroup = findViewById(R.id.RadioGroup);
        BTN = findViewById(R.id.BTN);

        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radio = RadioGroup.getCheckedRadioButtonId();
                RadioButton = findViewById(radio);
                String s = RadioButton.getText().toString();

                if (s.equals("Cheetah")) {
                    point = 10;
                }else{
                    point = 0;
                }

                int total = prev+point;
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("result",total);
                startActivity(intent);

            }
        });
    }
}