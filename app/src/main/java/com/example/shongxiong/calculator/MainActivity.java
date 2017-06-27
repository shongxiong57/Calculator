package com.example.shongxiong.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Result;
    EditText Num1, Num2;
    Button Add, Subtract, Multiply, Divide;

    float result_num;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result = (TextView)findViewById(R.id.Result);
        Num1 = (EditText)findViewById(R.id.Num1);
        Num2 = (EditText)findViewById(R.id.Num2);
        Add = (Button)findViewById(R.id.Add);
        Subtract = (Button)findViewById(R.id.Subtract);
        Multiply = (Button)findViewById(R.id.Multiply);
        Divide = (Button)findViewById(R.id.Divide);

        Add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(Num1.getText().toString());
                num2 = Integer.parseInt(Num2.getText().toString());
                result_num = num1 + num2;
                Result.setText(String.valueOf(result_num));
            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(Num1.getText().toString());
                num2 = Integer.parseInt(Num2.getText().toString());
                result_num = num1 - num2;
                Result.setText(String.valueOf(result_num));
            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(Num1.getText().toString());
                num2 = Integer.parseInt(Num2.getText().toString());
                result_num = num1 / num2;
                Result.setText(String.valueOf(result_num));
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(Num1.getText().toString());
                num2 = Integer.parseInt(Num2.getText().toString());
                result_num = num1 * num2;
                Result.setText(String.valueOf(result_num));
            }
        });
    }
}
