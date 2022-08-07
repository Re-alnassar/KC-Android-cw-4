package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView3 = findViewById(R.id.textView3);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        Button BUTTON = findViewById(R.id.BUTTON);
        EditText et1 = findViewById(R.id.et1);
        EditText et2 = findViewById(R.id.et2);


        BUTTON.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
              int num1 = Integer.parseInt(et1.getText().toString()) ;
              int num2 = Integer.parseInt(et2.getText().toString());

              int result = num1 + num2;

              textView3.setText(String.valueOf(result));


            }

        });
        }


    }

