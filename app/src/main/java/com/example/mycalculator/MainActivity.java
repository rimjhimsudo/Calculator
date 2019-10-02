package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView tv1,tv2;
    Button b1,b2,b3,b4;
    Integer ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        tv1=(TextView)findViewById(R.id.tv2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=et1.getText().toString();
                String num2=et2.getText().toString();
                ans = Integer.parseInt(num1) + Integer.parseInt(num2);
                tv1.setText(Integer.toString(ans));  //this work for printing no by converting them to string
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=et1.getText().toString();
                String num2=et2.getText().toString();
                ans = Integer.parseInt(num1) - Integer.parseInt(num2);
                tv1.setText(ans+"");            //tis also works for printing no with concatenated string
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=et1.getText().toString();
                String num2=et2.getText().toString();
                ans = Integer.parseInt(num1) / Integer.parseInt(num2);
                tv1.setText(ans+"");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=et1.getText().toString();
                String num2=et2.getText().toString();
                ans = Integer.parseInt(num1) * Integer.parseInt(num2);
                tv1.setText(ans+"");
            }
        });

    }
}
