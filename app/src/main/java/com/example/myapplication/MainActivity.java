package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup RadioGroup;
    RadioButton RadioButton;
    Button BTN;
    int point = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup = findViewById(R.id.RadioGroup);
        BTN = findViewById(R.id.next);

        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radio = RadioGroup.getCheckedRadioButtonId();
                RadioButton = findViewById(radio);
                String s = RadioButton.getText().toString();

                if (s.equals("February")){
                    point = 10;
                }
                else{
                    point = 0;
                }

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("result",point);
                startActivity(intent);
            }
        });


    }
}