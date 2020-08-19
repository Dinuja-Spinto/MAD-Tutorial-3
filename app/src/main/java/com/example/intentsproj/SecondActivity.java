package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity<button> extends AppCompatActivity {

    EditText no1,no2;
    float num1;
    float num2;
    float num;
    Button btnP,btnD,btnS,btnM;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        no1 = findViewById(R.id.n1);
        no2 = findViewById(R.id.n2);

        btnP = findViewById(R.id.btn_p);
        btnD = findViewById(R.id.btn_d);
        btnS = findViewById(R.id.btn_s);
        btnM = findViewById(R.id.btn_m);

        res = findViewById(R.id.res);

        num1 = getIntent().getExtras().getFloat("value1");
        no1.setText(num1+"");
        num2 = getIntent().getExtras().getFloat("value2");
        no2.setText(num2+"");

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = num1+num2;
                res.setText(num1 +" + "+ num2+" = "+num+"");
            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = num1/num2;
                res.setText(num1 +" / "+ num2+" = "+num+"");
            }
        });

        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = num1*num2;
                res.setText(num1 +" * "+ num2+" = "+num+"");
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = num1-num2;
                res.setText(num1 +" - "+ num2+" = "+num+"");
            }
        });
    }
}